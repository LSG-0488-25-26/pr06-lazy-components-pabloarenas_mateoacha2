package com.example.lazy_practica.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.lazy_practica.model.Dog

@Composable
fun DogItem(dog: Dog, onSelectedItem: (String) -> Unit) {
    Card(
        border = BorderStroke(2.dp, dog.breed.color),
        modifier = Modifier
            .fillMaxWidth()
            // Afegir propietat clickable i li definim el comportament
            .clickable { onSelectedItem(dog.name) }
    ) {
        Row(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = dog.image),
                contentDescription = dog.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
                    .background(dog.breed.color)
            )
            Column(modifier = Modifier.padding(start = 12.dp, top = 8.dp)) {
                Text(
                    text = dog.name,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = dog.breed.name
                        .lowercase()
                        .replace("_", " ")
                        .replaceFirstChar { it.uppercase() },
                    color = dog.breed.color
                )
            }
        }
    }
}
