package com.rajkishorbgp.smarthomecontrol

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.rajkishorbgp.smarthomecontrol.adapter.HomeGridViewAdapter
import com.rajkishorbgp.smarthomecontrol.model.CardItem

class HomeFragment : Fragment() {

    private lateinit var gridView: GridView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        gridView = view.findViewById(R.id.grid_view)

        val list = ArrayList<CardItem>()
        list.add(CardItem("Electrical & Lighting Control", R.drawable.led_lite))
        list.add(CardItem("Appliances Control", R.drawable.air_conditioner))
        list.add(CardItem("Security & Door Control \nSmart Door Lock", R.drawable.security))
        list.add(CardItem("Environment Monitoring\n" +
                "Temperature Sensor", R.drawable.environmental_monitoring))
        list.add(CardItem("Water & Utility Control", R.drawable.water))
        list.add(CardItem("Music control", R.drawable.music))
        list.add(CardItem("CCTV Camera", R.drawable.cctv_camera))
        list.add(CardItem("Automation Features", R.drawable.artificial_intelligence))


        val adapter = HomeGridViewAdapter(requireContext(), list)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            when (position) {

                0 -> {
                    startActivity(Intent(requireContext(), ElectricalActivity::class.java))
                }
                1 -> {
                    Toast.makeText(
                        requireContext(),
                        "Appliances Control Clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                2 -> {
                    Toast.makeText(
                        requireContext(),
                        "Security & Door Control Clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                3 -> {
                    Toast.makeText(
                        requireContext(),
                        "Security & Smart Door Lock",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                4 -> {
                    Toast.makeText(
                        requireContext(),
                        "Environment Monitoring",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                5 -> {
                    Toast.makeText(
                        requireContext(),
                        "Security & Door Control Clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                6 -> {
                    Toast.makeText(
                        requireContext(),
                        "Water & Utility Control",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                7 -> {
                    Toast.makeText(
                        requireContext(),
                        "Music control",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        return view
    }
}
