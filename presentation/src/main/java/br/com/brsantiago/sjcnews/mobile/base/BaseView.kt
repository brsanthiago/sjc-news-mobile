package br.com.brsantiago.sjcnews.mobile.search

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by Bruno Santiago on 20/02/2018..
 * email: bruno.santhiago@outlook.com
 */
interface BaseView {

    fun getContext(): Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)

    fun showProgress()

    fun hideProgress()
}