package br.com.brsantiago.sjcnews.domain.extension

import br.com.brsantiago.sjcnews.domain.model.NoticeDomain
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Bruno Santiago on 20/02/2018..
 * email: bruno.santhiago@outlook.com
 */

fun NoticeDomain.categoryView(): String {

    if (title != null) {
        return title.split("-")[0]
    }
    return ""
}
fun NoticeDomain.titleView(): String {
    if (title != null) {
        return title.split("-")[1]
    }
    return "Prefeitura de São José dos Campos"
}