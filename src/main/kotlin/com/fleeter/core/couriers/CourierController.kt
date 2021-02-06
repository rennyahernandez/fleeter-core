package com.fleeter.core.couriers

import com.fleeter.core.couriers.models.Courier
import io.reactivex.rxjava3.core.Single
import org.springframework.web.bind.annotation.*


@RestController
class CourierController {

    @GetMapping("/courier/{id}")
    fun getCourier(@PathVariable id: Long): Single<Courier> {
        return Single.just(Courier(
            id = 1,
            firstName = "Ernesto",
            lastName = "Garcia",
            nationality = "Argentina",
            documentNumber = "1001010101",
            documentType = "DNI"
        ))
    }

    @PostMapping("/courier/")
    fun createCourier(@RequestBody courier: Courier): Single<Courier> {
        println("String $courier")
        return Single.just(Courier(
            id = 1,
            firstName = "Ernesto",
            lastName = "Garcia",
            nationality = "Argentina",
            documentNumber = "1001010101",
            documentType = "DNI"
        ))
    }
}