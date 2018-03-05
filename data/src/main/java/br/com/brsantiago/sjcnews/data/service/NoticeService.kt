package br.com.brsantiago.sjcnews.data.service

import br.com.brsantiago.sjcnews.data.model.NoticeResponse
import br.com.brsantiago.sjcnews.data.network.SjcApi
import io.reactivex.Observable

/**
 * Created by bruno on 03/03/18.
 */
class NoticeService {
    fun findAll(page: Int?): Observable<NoticeResponse> {
        return SjcApi.create().noticies(page)
    }
}