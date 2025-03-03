package vn.edu.usth.spinner

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpinner (val activity: Activity, val list2: List<OutData>) : ArrayAdapter<OutData>(activity,R.layout.list_mon_an){

    override fun getCount(): Int {
        return list2.size
        // Vẽ lên spinner bao nhiêu dòng
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // position: Int Vị trí của món ăn trong danh sách list
        // convertView: View? chế độ xem cho từng mục trong spinner
        // parent: ViewGroup : Viewgroup cha đang chứa spinner
        return initView(position,convertView,parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position,convertView,parent)
    }
    //  Hàm xử lý view cho spinner
    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context = activity.layoutInflater
        // layoutInflater là 1 component
        // Giúp chuyển đổi layout xml thành View trong android
        val rowView = context.inflate(R.layout.list_mon_an,parent,false)
        // Cơ bản ý nghĩa dòng lệnh này là biến 1 xml thành 1 view

        val images = rowView.findViewById<ImageView>(R.id.images)
        val txtMonAn = rowView.findViewById<TextView>(R.id.txtMonAn)

        images.setImageResource(list2[position].image)
        txtMonAn.text= list2[position].mieuTa

        return rowView
    }
}