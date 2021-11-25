package com.kei.aplikasiandroiduntukpemulasubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.kei.aplikasiandroiduntukpemulasubmission.data.Jacket
import com.kei.aplikasiandroiduntukpemulasubmission.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var detailBinding: ActivityDetailBinding
    private lateinit var jacket: Jacket

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)
        jacket = intent.getParcelableExtra<Jacket>(EXTRA_USER) as Jacket

        showDetail()
    }

    private fun showDetail() {
        detailBinding.apply {
            Glide.with(this.root).load(jacket.image).circleCrop().into(ivJacketDetail)
            tvNameDetail.text = jacket.name
            tvJacketPriceDetail.text = jacket.price
            tvDescJacketDetail.text = jacket.desc

        }


    }

    companion object {
        const val EXTRA_USER = "extra_user"
    }
}