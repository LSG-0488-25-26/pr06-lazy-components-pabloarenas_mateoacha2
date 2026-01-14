package com.example.lazy_practica.model

import androidx.annotation.DrawableRes

data class Dog(
    var name: String,
    var breed: DogBreed,
    // És de tipus Int perquè internament Android Studio assigna un valor enter a cada element drawable
    @DrawableRes var image: Int
)
