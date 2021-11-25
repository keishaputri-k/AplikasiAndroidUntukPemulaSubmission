package com.kei.aplikasiandroiduntukpemulasubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.kei.aplikasiandroiduntukpemulasubmission.adapter.JacketAdapter
import kotlinx.android.synthetic.main.activity_main.*
import com.kei.aplikasiandroiduntukpemulasubmission.data.DataJacket
import com.kei.aplikasiandroiduntukpemulasubmission.data.Jacket
import com.kei.aplikasiandroiduntukpemulasubmission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private var list: ArrayList<Jacket> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        rvMain.setHasFixedSize(true)
        list.addAll(DataJacket.listJacket)
        addRecyclerViewList()
    }

    private fun addRecyclerViewList() {
        val jacketAdapter = JacketAdapter(list)
        mainBinding.rvMain.layoutManager = LinearLayoutManager(this)
        mainBinding.rvMain.adapter = jacketAdapter

        jacketAdapter.setOnClickCallback(object : JacketAdapter.OnItemClickCallBack{
            override fun onItemClicked(jacket: Jacket) {
                setSelectedUsers(jacket)
            }

        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profile -> {
                intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun setSelectedUsers(jacket: Jacket) {
        val intentDetail = Intent(this@MainActivity, DetailActivity::class.java)
        intentDetail.putExtra(DetailActivity.EXTRA_USER, jacket)
        startActivity(intentDetail)
    }

}