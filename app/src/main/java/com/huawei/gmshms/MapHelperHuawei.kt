package com.huawei.hmsgms

import androidx.appcompat.app.AppCompatActivity
import com.huawei.gmshms.R
import com.huawei.hms.maps.HuaweiMap
import com.huawei.hms.maps.SupportMapFragment
import com.huawei.hms.maps.model.LatLng
import com.huawei.hms.maps.model.MarkerOptions

class MapHelperHuawei {

    private lateinit var huaweiMap : HuaweiMap
    private var mActivity : AppCompatActivity

    constructor(activity: AppCompatActivity)
    {
        mActivity = activity
        initMap()
    }
    fun initMap()
    {
        val mapFragment  = (mActivity.supportFragmentManager.findFragmentById(R.id.mapFragmentHuawei) as SupportMapFragment)
        mapFragment.getMapAsync {
            huaweiMap = it
            huaweiMap.addMarker(MarkerOptions().position(LatLng(6.2186, -75.5742)).title("HUAWEI")).snippet = "Hello From Maps!"
        }
    }
}