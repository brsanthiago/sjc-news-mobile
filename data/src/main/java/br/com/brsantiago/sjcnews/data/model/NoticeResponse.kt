package br.com.brsantiago.sjcnews.data.model

/**
 * Created by bruno on 03/03/18.
 */
class NoticeResponse {
    val content: MutableList<Notice>? = mutableListOf()
    val totalPages: Int? = 0
    val totalElements: Int? = 0
    val last: Boolean? = false
    val first: Boolean? = false
    val size: Int? = 20
    val number: Int? = 0
    val numberOfElements: Int? = 0
}