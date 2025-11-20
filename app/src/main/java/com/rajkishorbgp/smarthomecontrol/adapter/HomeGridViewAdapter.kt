package com.rajkishorbgp.smarthomecontrol.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.rajkishorbgp.smarthomecontrol.R
import com.rajkishorbgp.smarthomecontrol.model.CardItem

class HomeGridViewAdapter(
    context: Context,
    list: ArrayList<CardItem>
) : ArrayAdapter<CardItem?>(context, 0, list as List<CardItem?>) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        var itemView = view
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
        }

        val model: CardItem? = getItem(position)
        val textView = itemView!!.findViewById<TextView>(R.id.text_view)
        val imageView = itemView.findViewById<ImageView>(R.id.image_view)

        textView.text = model!!.name
        imageView.setImageResource(model.image)
        return itemView
    }
}