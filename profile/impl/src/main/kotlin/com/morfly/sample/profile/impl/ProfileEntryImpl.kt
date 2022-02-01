@file:SuppressLint("ComposableNaming")

package com.morfly.sample.profile.impl

import android.annotation.SuppressLint
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.morfly.sample.common.Destinations
import com.morfly.sample.profile.ProfileEntry
import com.morfly.sample.profile.impl.settings.SettingsViewModel
import com.morfly.sample.profile.impl.settings.ui.SettingsScreen
import com.morfly.sample.profile.impl.userprofile.UserProfileViewModel
import com.morfly.sample.profile.impl.userprofile.ui.UserProfileScreen
import javax.inject.Inject


class ProfileEntryImpl @Inject constructor() : ProfileEntry() {

    override fun NavGraphBuilder.navigation(
        navController: NavHostController,
        destinations: Destinations,
    ) {
        navigation(startDestination = myProfileDestination(), route = "@profile") {

            composable(route = featureRoute, arguments) {
                val userId = it.arguments?.getString(ARG_USER_ID)

                // need userId
                val viewModel = hiltViewModel<UserProfileViewModel>()
                UserProfileScreen(navController, viewModel)
            }

            composable(route = InternalRoutes.SETTINGS) {
                val viewModel = hiltViewModel<SettingsViewModel>()
                SettingsScreen(viewModel)
            }
        }
    }

    internal object InternalRoutes {
        const val SETTINGS = "settings"
    }
}
