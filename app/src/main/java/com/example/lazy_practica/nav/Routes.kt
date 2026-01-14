package com.example.lazy_practica.nav

sealed class Routes(val route: String) {
    object DogList: Routes("DogList")

    object DetailScreen: Routes("DetailScreen/{dogName}") {
        fun createRoute(dogName: String) = "DetailScreen/$dogName"
    }
}
