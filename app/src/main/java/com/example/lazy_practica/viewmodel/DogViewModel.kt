package com.example.lazy_practica.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lazy_practica.R
import com.example.lazy_practica.model.Dog
import com.example.lazy_practica.model.DogBreed

class DogViewModel : ViewModel() {
    private val _dogList = MutableLiveData<List<Dog>>()
    val dogList: LiveData<List<Dog>> = _dogList

    init {
        loadDogs()
    }

    private fun loadDogs() {
        val dogs = mutableListOf<Dog>()
        dogs.add(Dog("Max", DogBreed.LABRADOR, R.drawable.labrador))
        dogs.add(Dog("Buddy", DogBreed.GOLDEN_RETRIEVER, R.drawable.golden))
        dogs.add(Dog("Charlie", DogBreed.GERMAN_SHEPHERD, R.drawable.shepherd))
        dogs.add(Dog("Rocky", DogBreed.BULLDOG, R.drawable.bulldog))
        dogs.add(Dog("Cooper", DogBreed.BEAGLE, R.drawable.beagle))
        dogs.add(Dog("Luna", DogBreed.POODLE, R.drawable.poodle))
        dogs.add(Dog("Duke", DogBreed.ROTTWEILER, R.drawable.rottweiler))
        dogs.add(Dog("Bella", DogBreed.HUSKY, R.drawable.husky))
        dogs.add(Dog("Spot", DogBreed.DALMATIAN, R.drawable.dalmatian))
        _dogList.value = dogs
    }
}
