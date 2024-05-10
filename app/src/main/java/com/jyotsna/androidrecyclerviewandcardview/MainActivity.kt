package com.jyotsna.androidrecyclerviewandcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jyotsna.androidrecyclerviewandcardview.R.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val recyclerView: RecyclerView = findViewById(id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Set the grid layout with 2 columns
        val imageList = listOf(drawable.rainy, drawable.sunny, drawable.sunset,drawable.ship, drawable.seass, drawable.winter,drawable.rainy, drawable.sea, drawable.seas,drawable.rainy,
            drawable.thunderstorm, drawable.woman, )
        val captionList = listOf("Caption 1", "Caption 2", "Caption 3","Caption 4", "Caption 5", "Caption 6" ,
            "Caption 7", "Caption 8", "Caption 9")
        recyclerView.adapter = MyAdapter(imageList, captionList)
    }
}
