package br.com.brsantiago.sjcnews.mobile.search


/**
 * Created by Bruno Santiago on 20/02/2018..
 * email: bruno.santhiago@outlook.com
 */
interface BasePresenter<in V : BaseView> {

    fun attachView(view: V)

    fun detachView()
}