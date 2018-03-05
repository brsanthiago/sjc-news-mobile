package br.com.brsantiago.sjcnews.mobile.search

import br.com.brsantiago.sjcnews.domain.model.NoticeDomain

/**
 * Created by bruno on 03/03/18.
 */interface NoticeContract {

    interface View : BaseView {
        fun showNotices(noticies: MutableList<NoticeDomain>)
    }

    interface Presenter : BasePresenter<View> {
        fun loadNotices(page: Int?)
    }
}