package br.com.brsantiago.sjcnews.mobile.search


/**
 * Created by Bruno Santiago on 20/02/2018..
 * email: bruno.santhiago@outlook.com
 */
open class BasePresenterImpl <V : BaseView> : BasePresenter<V> {

    protected var view: V? = null

    override fun attachView(mView: V) {
        view = mView
    }

    override fun detachView() {
        view = null
    }
    }