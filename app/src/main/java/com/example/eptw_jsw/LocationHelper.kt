package com.example.eptw_jsw

import android.content.Context
import com.google.android.gms.location.LocationServices

class LocationHelper(private val context: Context) {
    private var fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)

    fun getLocation(onResult: (Double, Double) -> Unit) {
        if (ActivityCompact.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_lOCATION) == PackageManager.PERMISSION_GRANTED) {
            fusedLocationClient.lastLocation.addOnSuccessListener { location ->
                location?.let {
                    onResult(it.latitude, it.longitude)
                }
            }
        }
    }
}