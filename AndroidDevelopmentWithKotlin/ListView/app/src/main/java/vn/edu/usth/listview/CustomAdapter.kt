package vn.edu.usth.listview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter constructor(val activity: Activity, val list: List<OurData>): ArrayAdapter<OurData>(activity, R.layout.list_item) {
    override fun getCount(): Int {
        return list.size  // số dòng sẽ vẽ lên list view
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var contexts = activity.layoutInflater
        // layoutInflater là 1 component giúp chuyển layout file(Xml) thành View trong Android.
        //      Thường sử dụng nó trong phương thức onCreateView của fragment hoặc phương thức getView khi custom adapter.

        val rowView = contexts.inflate(R.layout.list_item, parent, false)    // dòng sẽ hiển thị lên

//  Tham số thứ nhất là: int resource, nó chính là xml layout file mà chúng ta muốn chuyển đổi thành View.
//  Tham số thứ hai là: ViewGroup parent, nó là ViewGroup nơi mà xml layout file(tham số thứ nhất) có thể được nhúng vào, LayoutInflater sẽ chuyển đổi xml layout file
//       thành View và sử dụng các thuộc tính phù hợp với ViewGroup parent.
//  Tham số thứ ba là: attachToRoot, khi mà attachToRoot=true thì ngay sau khi quá trình chuyển đổi xml file(resource) thành View hoàn thành thì nó sẽ nhúng View đó
//       vào ViewGroup parent (RIGHT NOW), khi attachToRoot = false thì nó chỉ chuyển đổi xml file(resource) thành View mà không thêm ngay vào ViewGroup(NOT NOW)

        val images = rowView.findViewById<ImageView>(R.id.images)
        val title = rowView.findViewById<TextView>(R.id.txtTitle)
        val description = rowView.findViewById<TextView>(R.id.txtDescription)

        title.text = list[position].title
        description.text = list[position].description
        images.setImageResource(list[position].image)
        return rowView
    }
}