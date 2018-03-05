package br.com.brsantiago.sjcnews.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by bruno on 03/03/18.
 */
class Notice {
    @SerializedName("noticia_id")
    @Expose
    val noticeId: String? = null

    @Expose
    val code: String? = null

    @Expose
    val guid: String? = null

    @Expose
    val link: String? = null

    @Expose
    val title: String? = null

    @SerializedName("foto")
    @Expose
    val picture: String? = null

    @SerializedName("creditoFotografo")
    @Expose
    val pictureCredit: String? = null

    @SerializedName("legendaFoto")
    @Expose
    val pictureLegend: String? = null

    @Expose
    val pubDate: String? = null
}