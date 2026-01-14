package com.example.lazy_practica.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.lazy_practica.nav.Routes
import com.example.lazy_practica.viewmodel.DogViewModel

@Composable
fun LazyColumnDogs(modifier: Modifier, navController: NavController) {
    val viewModel: DogViewModel = viewModel()
    val dogs = viewModel.dogList.observeAsState(emptyList())

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .padding(vertical = 30.dp)
            .fillMaxHeight()
    ) {
        items(dogs.value) { dog ->
            DogItem(dog = dog) {
                navController.navigate(Routes.DetailScreen.createRoute(dog.name))
            }
        }
    }
}
