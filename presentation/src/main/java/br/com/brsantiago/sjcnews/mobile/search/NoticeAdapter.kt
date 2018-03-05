package br.com.brsantiago.sjcnews.mobile.search

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.brsantiago.sjcnews.domain.model.NoticeDomain
import br.com.brsantiago.sjcnews.mobile.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_notice.*

/**
 * Created by Bruno Santiago on 20/02/2018..
 * email: bruno.santhiago@outlook.com
 */
class NoticeAdapter(private val notices: MutableList<NoticeDomain>,
                    val onClick: (NoticeDomain) -> Unit)
                            : RecyclerView.Adapter<NoticeAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindData(notices[position])
    }
    override fun getItemCount(): Int = notices.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent?.context)
                .inflate(R.layout.item_notice, parent, false).let {
            ViewHolder(it, onClick)
        }
    }

    class ViewHolder(override val containerView: View,
                     val onClick: (NoticeDomain) -> Unit)
        : RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bindData(administrador: NoticeDomain) {
            with(administrador) {
                tv_name.text = title
                tv_email.text = code
                containerView.setOnClickListener { onClick(this) }
            }
        }
    }
    fun addAdministrators(admins: List<NoticeDomain>) {
        notices.clear()
        notices.addAll(admins)
    }
}