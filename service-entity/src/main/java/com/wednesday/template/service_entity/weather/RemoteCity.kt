package com.wednesday.template.service_entity.weather

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RemoteCity(
    @SerialName("woeid")
    val woeid: Int,

    @SerialName("title")
    val title: String,

    @SerialName("location_type")
    val locationType: String
)
