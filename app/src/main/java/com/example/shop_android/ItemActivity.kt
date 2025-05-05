package com.example.shop_android

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_item)

        val title: TextView = findViewById(R.id.item_list_title_one)
        val text: TextView = findViewById(R.id.item_list_text)
        val image: ImageView = findViewById(R.id.item_image)

        title.text = intent.getStringExtra("itemTitle")
        text.text = intent.getStringExtra("itemText")
        image.setImageResource(
            resources.getIdentifier(
                intent.getStringExtra("itemImage"),
                "drawable",
                packageName
            )
        )
    }
}