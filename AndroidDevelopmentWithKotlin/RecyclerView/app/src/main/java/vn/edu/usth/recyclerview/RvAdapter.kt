package vn.edu.usth.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.edu.usth.recyclerview.databinding.LayoutItemBinding

class RvAdapter(val ds: List<OutData>, val onPhimClick:RvInterface) : RecyclerView.Adapter<RvAdapter.PhimViewHolder>() {

    // ViewHolder class using View Binding
    inner class PhimViewHolder(val binding: LayoutItemBinding) : RecyclerView.ViewHolder(binding.root)

    // Ctrl + O
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhimViewHolder {
        val binding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhimViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhimViewHolder, position: Int) {
        holder.binding.apply {
            txtMieuTa.text = ds[position].mieuTa
            txtTenPhim.text = ds[position].tenPhim
            imgPhim.setImageResource(ds[position].image)

            // Lắng nghe item click đc chọn
            holder.binding.root.setOnClickListener {
                onPhimClick.onClickPhim(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}
