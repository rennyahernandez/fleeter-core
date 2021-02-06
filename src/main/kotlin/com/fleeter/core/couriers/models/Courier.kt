package com.fleeter.core.couriers.models

data class Courier(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val documentNumber: String,
    val nationality: String,
    val documentType: String
)
