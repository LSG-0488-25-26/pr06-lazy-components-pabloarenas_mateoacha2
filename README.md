# PR06 - Lazy Components: Dog Breeds App

Aplicacion Android desarrollada con Jetpack Compose que muestra una lista de perros usando LazyColumn. El proyecto sigue el patron MVVM y usa LiveData para gestionar los datos.

## Descripcion

Esta app muestra una lista de 9 perros de diferentes razas. Cada perro se muestra en una tarjeta con su imagen, nombre y raza. Al hacer click en cualquier perro, navega a una pantalla de detalle con mas informacion.

## Estructura del Proyecto

### Model (Datos)

- **Dog.kt**: Data class que representa un perro
  - name: String - Nombre del perro
  - breed: DogBreed - Raza del perro
  - image: Int - Referencia a la imagen drawable

- **DogBreed.kt**: Enum con las razas disponibles
  - Cada raza tiene un color asociado
  - Razas: Labrador, Golden Retriever, German Shepherd, Bulldog, Beagle, Poodle, Rottweiler, Husky, Dalmatian

### View (Vista)

- **LazyColumnDogs.kt**: Pantalla principal con la lista de perros usando LazyColumn
- **DogItem.kt**: Componente que muestra cada perro en una Card clickable
- **DetailScreen.kt**: Pantalla de detalle que muestra la imagen circular, nombre y raza del perro
- **MyAppNavHost.kt**: Gestiona la navegacion entre pantallas

### ViewModel

- **DogViewModel.kt**: ViewModel que gestiona la lista de perros usando LiveData
  - Los datos se cargan manualmente (9 perros)
  - Las vistas observan los cambios mediante LiveData

## Tecnologias Usadas

- **Jetpack Compose**: Para la UI
- **Navigation Compose**: Para navegar entre pantallas
- **LiveData**: Para gestionar datos reactivos
- **ViewModel**: Para separar la logica de la vista
- **LazyColumn**: Para mostrar listas eficientemente

## API Utilizada

Se usa como referencia la **Dog CEO API** (https://dog.ceo/dog-api/), aunque en esta practica los datos NO se consumen directamente de la API. Las imagenes se descargaron manualmente y se colocaron en `app/res/drawable/`, y los objetos Dog se instanciaron manualmente en el `DogViewModel`.

## Dependencias

```kotlin
// Navigation
implementation("androidx.navigation:navigation-compose:2.7.5")

// ViewModel
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

// LiveData
implementation("androidx.compose.runtime:runtime-livedata:1.5.4")
```

## Instalacion y Ejecucion

1. Clonar el repositorio
2. Abrir el proyecto en Android Studio
3. Sincronizar las dependencias de Gradle
4. Ejecutar la aplicacion en un emulador o dispositivo fisic

## Capturas de Pantalla

### Pantalla Principal (Lista)

![Lista de perros](capturas/Captura%20de%20pantalla%202026-01-14%20224310.png)

### Pantalla de Detalle

![Detalle de perro](capturas/Captura%20de%20pantalla%202026-01-14%20224320.png)

## Funcionalidades Implementadas

- Estructuras de datos (Dog, DogBreed)
- 9 perros instanciados manualmente con sus imagenes
- Arquitectura MVVM con LiveData
- Navegacion entre pantallas
- Elementos clickables que navegan al detalle
- LazyColumn para mostrar la lista

## Autores

- Pablo Arenas
- Mateo Acha

## Licencia

Proyecto academico para la asignatura DAM2 0488: Desarrollo de interfaces.
