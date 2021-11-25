package com.kei.aplikasiandroiduntukpemulasubmission.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kei.aplikasiandroiduntukpemulasubmission.data.Jacket
import com.kei.aplikasiandroiduntukpemulasubmission.databinding.ItemJacketBinding


class JacketAdapter(private val listDataJacket: ArrayList<Jacket>) :
    RecyclerView.Adapter<JacketAdapter.JacketViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallBack

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallBack) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallBack {
        fun onItemClicked(jacket: Jacket)
    }

    inner class JacketViewHolder(var jacketBinding: ItemJacketBinding) :
        RecyclerView.ViewHolder(jacketBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JacketViewHolder {
        val jacketBinding =
            ItemJacketBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return JacketViewHolder(jacketBinding)
    }

    override fun getItemCount(): Int = listDataJacket.size

    override fun onBindViewHolder(holder: JacketViewHolder, position: Int) {
        val jacket = listDataJacket[position]

        Glide.with(holder.itemView.context).load(jacket.image)
            .into(holder.jacketBinding.ivJacketItem)
        holder.jacketBinding.tvJacketNameItem.text = jacket.name
        holder.jacketBinding.tvJacketPriceItem.text = jacket.price
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDataJacket[holder.adapterPosition])
        }
    }
}