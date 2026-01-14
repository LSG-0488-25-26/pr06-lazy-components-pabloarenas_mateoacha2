package com.example.lazy_practica.viewmodel

import com.example.lazy_practica.R
import com.example.lazy_practica.model.Dog
import com.example.lazy_practica.model.DogBreed

fun getDogList(): MutableList<Dog> {
    val dogList: MutableList<Dog> = mutableListOf()

    dogList.add(Dog("Max", DogBreed.LABRADOR, R.drawable.labrador))
    dogList.add(Dog("Buddy", DogBreed.GOLDEN_RETRIEVER, R.drawable.golden))
    dogList.add(Dog("Charlie", DogBreed.GERMAN_SHEPHERD, R.drawable.shepherd))
    dogList.add(Dog("Rocky", DogBreed.BULLDOG, R.drawable.bulldog))
    dogList.add(Dog("Cooper", DogBreed.BEAGLE, R.drawable.beagle))
    dogList.add(Dog("Luna", DogBreed.POODLE, R.drawable.poodle))
    dogList.add(Dog("Duke", DogBreed.ROTTWEILER, R.drawable.rottweiler))
    dogList.add(Dog("Bella", DogBreed.HUSKY, R.drawable.husky))
    dogList.add(Dog("Spot", DogBreed.DALMATIAN, R.drawable.dalmatian))

    return dogList
}
