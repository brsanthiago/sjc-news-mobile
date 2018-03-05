package br.com.brsantiago.sjcnews.data.network

import br.com.brsantiago.sjcnews.data.model.NoticeResponse
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by bruno on 03/03/18.
 */
interface SjcApi {

    @GET("item")
    fun noticies(@Query("page") page: Int? = 0): Observable<NoticeResponse>

    /**
     * Companion object for the factory
     */
    companion object Factory {
        fun create(): SjcApi {
            val base = "https://sjcnews.herokuapp.com/api/"
            val retrofit = retrofit2.Retrofit.Builder()
                    .client(OkHttpClient.Builder().build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(base)
                    .build()

            return retrofit.create(SjcApi::class.java)
        }
    }
}