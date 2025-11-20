package com.rajkishorbgp.smarthomecontrol

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.rajkishorbgp.smarthomecontrol.adapter.HomeGridViewAdapter
import com.rajkishorbgp.smarthomecontrol.model.CardItem

class ElectricalActivity : AppCompatActivity() {
    private lateinit var gridView: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electrical)

        gridView = findViewById(R.id.grid_view)
        val list = ArrayList<CardItem>()

        list.add(CardItem("Fan", R.drawable.fan))
        list.add(CardItem("Tube Light", R.drawable.tube_light))
        list.add(CardItem("Smart LED Strip (RGB control)", R.drawable.tube_light))

        val adapter = HomeGridViewAdapter(this, list)
        gridView.adapter = adapter
    }
}