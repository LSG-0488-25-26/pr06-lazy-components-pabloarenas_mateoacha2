package com.example.lazy_practica.model

import androidx.compose.ui.graphics.Color

enum class DogBreed(val color: Color) {
    LABRADOR(Color(0xFFFDD835)),        // Groc daurat
    GOLDEN_RETRIEVER(Color(0xFFFFB300)), // Daurat
    GERMAN_SHEPHERD(Color(0xFF8D6E63)),  // Marró
    BULLDOG(Color(0xFF9E9E9E)),          // Gris
    BEAGLE(Color(0xFFFF6F00)),           // Taronja
    POODLE(Color(0xFFECEFF1)),           // Blanc grisenc
    ROTTWEILER(Color(0xFF212121)),       // Negre
    HUSKY(Color(0xFF42A5F5)),            // Blau
    DALMATIAN(Color(0xFFFFFFFF))         // Blanc
}
