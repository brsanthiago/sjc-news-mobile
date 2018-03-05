package br.com.brsantiago.sjcnews.mobile.search

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import br.com.brsantiago.sjcnews.domain.model.NoticeDomain
import br.com.brsantiago.sjcnews.mobile.R
import kotlinx.android.synthetic.main.notices_activity.*

/**
 * Created by Bruno Santiago on 17/02/2018..
 * email: bruno.santhiago@outlook.com
 */
class NoticesActivity : BaseActivity<NoticeContract.View,
        NoticePresenter>(),
        NoticeContract.View {


    private var adapter: NoticeAdapter? = null
    override var presenter: NoticePresenter = NoticePresenter()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notices_activity)
        initialize()
        presenter.loadNotices(0)

        toolbar.title = getString(R.string.app_name)
        showProgress()

    }
    private fun initialize() {
        adapter = NoticeAdapter(ArrayList<NoticeDomain>(), {
        })
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }


    override fun showNotices(noticies: MutableList<NoticeDomain>) {
        adapter?.addAdministrators(noticies)
        adapter?.notifyDataSetChanged()
        hideProgress()
    }

    override fun showProgress() {
        recyclerView.visibility = View.GONE
        progress_bar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        recyclerView.visibility = View.VISIBLE
        progress_bar.visibility = View.GONE

    }
    override fun showError(error: String?) {
        super.showError(error)
        progress_bar.visibility = View.GONE
    }
}