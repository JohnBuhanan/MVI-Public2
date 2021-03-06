package com.morfly.sample.profile.impl.settings

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor() : ViewModel() {

    val settings = listOf(
        SettingsItem("Some configuration", activated = true),
        SettingsItem("Another configuration", activated = false),
    )

    class SettingsItem(val name: String, val activated: Boolean)
}
