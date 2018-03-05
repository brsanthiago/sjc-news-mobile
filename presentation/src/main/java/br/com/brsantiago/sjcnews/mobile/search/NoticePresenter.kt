package br.com.brsantiago.sjcnews.mobile.search

import br.com.brsantiago.sjcnews.domain.model.NoticeInteractor
import br.com.brsantiago.sjcnews.domain.model.ResponseDomain
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * Created by Bruno Santiago on 20/02/2018..
 * email: bruno.santhiago@outlook.com
 */
class NoticePresenter : BasePresenterImpl<NoticeContract.View>(), NoticeContract.Presenter {
    override fun loadNotices(page: Int?) {

        view?.showProgress()
        NoticeInteractor().findAll(0)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    response: ResponseDomain ->

                    view?.hideProgress()
                    view?.showNotices(response.content!!)
                }, {
                    error: Throwable ->
                    view?.hideProgress()
                    view?.showError(error.message)
                })
}
}