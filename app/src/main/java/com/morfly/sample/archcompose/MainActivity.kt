package com.morfly.sample.archcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.morfly.sample.common.Destinations
import com.morfly.sample.common.ui.NavigationBar
import com.morfly.sample.common.ui.StatusBar
import com.morfly.sample.common.ui.theme.AppBlack
import com.morfly.sample.common.ui.theme.ComposeArchTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var destinations: Destinations

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeArchTheme {
                StatusBar(window, color = MaterialTheme.colors.background)

                Surface(color = MaterialTheme.colors.background) {
                    Navigation(destinations)
                }

                NavigationBar(window, color = AppBlack)
            }
        }
    }
}
