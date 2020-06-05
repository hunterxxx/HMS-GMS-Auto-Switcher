package com.huawei.hmsgms

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.huawei.gmshms.R

class MapHelperGoogle {

    private lateinit var map: GoogleMap
    private var mActivity: AppCompatActivity

    constructor(activity: AppCompatActivity) {
        mActivity = activity
        initMap()
    }

    fun initMap() {
        val mapFragment =
            (mActivity.supportFragmentManager.findFragmentById(R.id.mapFragmentGoogle) as SupportMapFragment)
        mapFragment.getMapAsync {
            map = it
            map.addMarker(
                MarkerOptions().position(LatLng(6.2186, -75.5742)).title("GOOGLE")
            ).snippet = "Hello From Maps!"
            Log.e("TEST", "GMAP CREATED")
        }
    }
}