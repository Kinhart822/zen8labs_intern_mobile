package vn.edu.usth.tablayoutviewpager2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.tabs.TabLayoutMediator
import vn.edu.usth.tablayoutviewpager2.databinding.ActivityMainBinding

//                      TabLayout (tab) & ViewPager2 (pager) Kotlin
@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        binding.pagerTest.adapter = adapter
        TabLayoutMediator(binding.tabDemo, binding.pagerTest){ tab, position ->
            when(position){
                0->{
                    tab.text="Tab1"
                }
                1->{
                    tab.text="Tab2"
                }
                2->{
                    tab.text="Tab3"
                }
                3->{
                    tab.text="Tab4"
                }
                4->{
                    tab.text="Tab5"
                }
            }
        }.attach()
    }
}