package br.com.brsantiago.sjcnews.domain.model

import br.com.brsantiago.sjcnews.data.service.NoticeService
import io.reactivex.Observable

/**
 * Created by bruno on 03/03/18.
 */
class NoticeInteractor {
    fun findAll(page: Int?) : Observable<ResponseDomain> {
        return NoticeService().findAll(page).map { response -> NoticeMapper().map(response) }
    }
}