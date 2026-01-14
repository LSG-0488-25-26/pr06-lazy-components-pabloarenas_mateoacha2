package com.example.lazy_practica.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lazy_practica.nav.Routes
import com.example.lazy_practica.viewmodel.getDogList

@Composable
fun LazyColumnDogs(modifier: Modifier, navController: NavController) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .padding(vertical = 30.dp)
            .fillMaxHeight()
    ) {
        items(getDogList()) { dog ->
            DogItem(dog = dog) {
                navController.navigate(Routes.DetailScreen.createRoute(dog.name))
            }
        }
    }
}
