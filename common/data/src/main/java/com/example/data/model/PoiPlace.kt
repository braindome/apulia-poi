package com.example.data.model

import android.content.Intent
import androidx.core.net.toUri

data class PoiPlace(
    val id: Int,
    val name: String,
    val description: String,
    val lat: Double,
    val lng: Double
)

fun PoiPlace.toIntent(action: String): Intent {
    return Intent(action).apply {
        data = "geo:$lat,$lng".toUri()
    }
}
