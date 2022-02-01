package com.morfly.sample.images.impl

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.morfly.sample.common.Destinations
import com.morfly.sample.common.find
import com.morfly.sample.images.ImagesEntry
import com.morfly.sample.images.impl.ui.ImageListScreen
import com.morfly.sample.profile.ProfileEntry
import javax.inject.Inject


class ImagesEntryImpl @Inject constructor() : ImagesEntry() {

    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry,
    ) {
        val viewModel = hiltViewModel<ImagesViewModel>()

        ImageListScreen(viewModel, onUserSelected = { userId ->
            val profileDestination = destinations
                .find<ProfileEntry>()
                .userProfileDestination(userId)
            navController.navigate(profileDestination)
        })
    }
}
