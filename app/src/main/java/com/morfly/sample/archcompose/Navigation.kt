package com.morfly.sample.archcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.morfly.sample.archcompose.ui.BottomMenuBar
import com.morfly.sample.common.Destinations
import com.morfly.sample.common.find
import com.morfly.sample.images.ImagesEntry
import com.morfly.sample.profile.ProfileEntry


@Composable
fun Navigation(destinations: Destinations) {
    val navController = rememberNavController()

    val imagesScreen = destinations.find<ImagesEntry>()
    val profileScreen = destinations.find<ProfileEntry>()

    Box(Modifier.fillMaxSize()) {
        NavHost(navController, startDestination = imagesScreen.destination()) {
            with(imagesScreen) {
                composable(navController, destinations)
            }
            with(profileScreen) {
                navigation(navController, destinations)
            }
        }
    }

    Box(Modifier.fillMaxHeight(), contentAlignment = Alignment.BottomCenter) {
        BottomMenuBar(navController, destinations)
    }
}
