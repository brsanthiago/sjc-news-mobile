package br.com.brsantiago.sjcnews.domain.model

class ResponseDomain {
    var content: MutableList<NoticeDomain>? = mutableListOf()
    var last: Boolean? = false
    var first: Boolean? = false
    var size: Int? = 20
    var number: Int? = 0
}
