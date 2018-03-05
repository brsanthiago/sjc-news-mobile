package br.com.brsantiago.sjcnews.domain.model

import br.com.brsantiago.sjcnews.data.model.Notice
import br.com.brsantiago.sjcnews.data.model.NoticeResponse

/**
 * Created by bruno on 03/03/18.
 */
class NoticeMapper {
    fun map(response: NoticeResponse): ResponseDomain {
        var domain = ResponseDomain()
        domain.content = contentMap(response.content!!)
        domain.first = response.first
        domain.last = response.last
        domain.number = response.number
        domain.size = response.size
        return domain
    }

    private fun contentMap(noticies: MutableList<Notice>): MutableList<NoticeDomain> {
        val noticiesDomain: MutableList<NoticeDomain> = mutableListOf()
        noticies.map { notice -> noticiesDomain.add(transformToDomain(notice)) }
        return noticiesDomain
    }

    private fun transformToDomain(notice: Notice) : NoticeDomain {
        return NoticeDomain(notice.code,
                notice.guid, notice.link, notice.link,
                notice.picture, notice.pictureCredit,
                notice.pictureLegend, notice.pubDate)
    }
}