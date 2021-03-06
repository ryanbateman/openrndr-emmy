package boids

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Aircraft (
    var hex: String,
    var flight: String?,
    var alt_baro: Int?,
    var alt_geom: Int?,
    var gs: Double?,
    var mag_heading: Double?,
    var baro_rate: Int?,
    var lat: Double?,
    var lon: Double?
)

