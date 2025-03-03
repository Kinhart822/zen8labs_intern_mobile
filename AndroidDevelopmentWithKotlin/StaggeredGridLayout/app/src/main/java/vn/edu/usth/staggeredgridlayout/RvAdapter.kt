package vn.edu.usth.staggeredgridlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.edu.usth.staggeredgridlayout.databinding.LayoutItemBinding

class RvAdapter(private val ds:List<Int>): RecyclerView.Adapter<RvAdapter.itemViewHolder>() {
    class itemViewHolder(var biding: LayoutItemBinding) : RecyclerView.ViewHolder(biding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val biding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return itemViewHolder(biding)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.biding.imgAnh.setImageResource(ds[position])
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}