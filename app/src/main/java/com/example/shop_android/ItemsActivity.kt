package com.example.shop_android

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.recycler_view_items)
        val items = arrayListOf<Item>()

        items.add(Item(1, "minions1", "миньон 1", "Миньон с мишкой", "min", 100))
        items.add(Item(2, "minions2", "миньон 2", "Удивленный миньон", "min", 150))
        items.add(Item(3, "minions3", "миньон 3", "Миньон - птичка", "min", 150))
        items.add(Item(4, "minions4", "миньон 4", "Что-то замышляющий миньон", "min", 100))
        items.add(Item(5, "minions5", "миньон 5", "Миньон с бананами", "min", 150))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)

    }
}