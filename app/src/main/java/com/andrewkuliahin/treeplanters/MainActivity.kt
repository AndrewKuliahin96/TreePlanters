package com.andrewkuliahin.treeplanters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng

class MainActivity : AppCompatActivity(R.layout.activity_main), OnMapReadyCallback {

    private var googleMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (supportFragmentManager.findFragmentById(R.id.mapFragment) as? SupportMapFragment)?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        this.googleMap = googleMap

        initMap()
    }

    private fun initMap() {
        val options = MarkerOptions()
            .position(LatLng(-33.852, 151.211))
            .title("Marker in Sydney")

        googleMap?.addMarker(options)
    }
}
