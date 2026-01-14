# PR06 - Lazy Components: Dog Breeds App

Aplicació Android desenvolupada amb Jetpack Compose que mostra una llista de gossos utilitzant components Lazy (LazyColumn). El projecte segueix el patró d'arquitectura MVVM i utilitza LiveData per gestionar les dades de forma reactiva.

## 📱 Descripció del Projecte

Aquesta aplicació permet visualitzar una llista de 9 gossos de diferents races. Cada gos es mostra en una targeta (Card) amb la seva imatge, nom i raça. En clicar sobre qualsevol gos de la llista, l'aplicació navega a una pantalla de detall que mostra informació ampliada del gos seleccionat.

## 🏗️ Arquitectura MVVM

El projecte segueix el patró **Model-View-ViewModel (MVVM)** per mantenir el codi organitzat, escalable i fàcil de mantenir:

### Model (Capa de Dades)
Representa les dades amb les que treballa l'aplicació:

- **`Dog.kt`**: Data class que defineix l'estructura d'un gos
  - `name: String` - Nom del gos
  - `breed: DogBreed` - Raça del gos (enum)
  - `image: Int` - Recurs drawable de la imatge (@DrawableRes)

- **`DogBreed.kt`**: Enum class que defineix les races de gossos
  - Cada raça té un color associat per personalitzar la UI
  - Races disponibles: Labrador, Golden Retriever, German Shepherd, Bulldog, Beagle, Poodle, Rottweiler, Husky, Dalmatian

### View (Capa de Vista)
Components visuals de l'aplicació utilitzant Jetpack Compose:

- **`LazyColumnDogs.kt`**: Pantalla principal amb la llista de gossos
  - Utilitza `LazyColumn` per mostrar la llista de forma eficient
  - Gestiona la navegació cap a la pantalla de detall

- **`DogItem.kt`**: Composable que representa cada element de la llista
  - Mostra la imatge, nom i raça del gos en una Card
  - Implementa la propietat `clickable` per navegar al detall

- **`DetailScreen.kt`**: Pantalla de detall d'un gos
  - Mostra la imatge del gos en format circular (380dp)
  - Mostra el nom i la raça amb estils personalitzats
  - Inclou un botó per tornar a la llista

- **`MyAppNavHost.kt`**: Gestiona la navegació entre pantalles
  - Configura el NavHost amb les rutes de l'aplicació
  - Gestiona el pas de paràmetres entre pantalles

### ViewModel (Capa de Controlador)
Connecta el Model amb la Vista i gestiona la lògica de negoci:

- **`DogController.kt`**: Conté la funció `getDogList()`
  - Retorna una llista mutable de gossos (`MutableList<Dog>`)
  - Les dades estan instanciades manualment (simulant una API)
  - Inclou 9 gossos amb les seves imatges locals

## 🔄 Ús de LiveData

LiveData s'utilitza per crear un sistema de subscripcions als canvis del model:

- Quan es produeix un canvi en les dades, el ViewModel avisa a la Vista a través de LiveData
- La Vista s'actualitza automàticament sense intervenció de l'usuari
- Això permet mantenir la UI sempre sincronitzada amb l'estat de les dades

## 📋 Lazy Components

### LazyColumn
Component que permet mostrar llistes llargues de forma eficient:

- **Renderització lazy**: Només es creen els elements visibles a la pantalla
- **Optimització de memòria**: Els elements fora de pantalla es reciclen
- **Scroll automàtic**: Gestiona el desplaçament vertical de forma nativa
- **Spacing personalitzable**: Utilitza `verticalArrangement` per separar elements

```kotlin
LazyColumn(
    verticalArrangement = Arrangement.spacedBy(4.dp),
    modifier = Modifier.padding(vertical = 30.dp).fillMaxHeight()
) {
    items(getDogList()) { dog ->
        DogItem(dog = dog) { ... }
    }
}
```

## 🧭 Navegació

El projecte utilitza **Navigation Compose** per navegar entre pantalles:

### Routes.kt
Defineix les rutes de navegació de l'aplicació:

- `DogList`: Ruta de la pantalla principal amb la llista
- `DetailScreen/{dogName}`: Ruta de la pantalla de detall amb paràmetre

### Pas de Paràmetres
La navegació passa el nom del gos com a paràmetre:

```kotlin
navController.navigate(Routes.DetailScreen.createRoute(dog.name))
```

A la pantalla de detall, es busca el gos per nom:

```kotlin
val dog = remember { getDogList().find { it.name == dogName } }
```

## 🐕 API Utilitzada

**Dog CEO API**: https://dog.ceo/dog-api/

- API pública sense necessitat d'API key
- Conté imatges de gossos de diferents races
- Fàcil d'utilitzar i ben documentada

**Nota**: En aquesta pràctica, les dades **NO** es consumeixen directament de l'API. Les imatges s'han descarregat manualment i s'han col·locat a `app/res/drawable/`. Els objectes Dog s'han instanciat manualment al `DogController.kt`.

## 📦 Dependències

El projecte utilitza les següents dependències:

```kotlin
// Navigation
implementation("androidx.navigation:navigation-compose:2.7.5")

// ViewModel
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")

// LiveData
implementation("androidx.compose.runtime:runtime-livedata:1.5.4")
```

## 🎨 Recursos Gràfics

Les imatges dels gossos estan ubicades a:
```
app/res/drawable/
├── labrador.jpg
├── golden.jpg
├── shepherd.jpg
├── bulldog.jpg
├── beagle.jpg
├── poodle.jpg
├── rottweiler.jpg
├── husky.jpg
└── dalmatian.jpg
```

## 🚀 Com Executar el Projecte

1. Clonar el repositori
2. Obrir el projecte amb Android Studio
3. Sincronitzar les dependències de Gradle
4. Descarregar les imatges dels gossos i col·locar-les a `app/res/drawable/`
5. Executar l'aplicació en un emulador o dispositiu físic

## ✅ Funcionalitats Implementades

- ✅ Estructures de dades adequades (Dog, DogBreed)
- ✅ Imatges descarregades i elements instanciats manualment (9 gossos)
- ✅ Implementació de MVVM i ús de LiveData
- ✅ Elements clickables amb navegació a vista de detall
- ✅ Documentació bàsica del projecte (README)

## 👥 Autors

- Pablo Arenas
- Mateo Acha

## 📄 Llicència

Aquest projecte és una pràctica acadèmica per a l'assignatura DAM2 0488: Desenvolupament d'interfícies.
