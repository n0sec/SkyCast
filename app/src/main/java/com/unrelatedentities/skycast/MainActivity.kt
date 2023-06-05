package com.unrelatedentities.skycast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.unrelatedentities.skycast.ui.WeatherDetailsScreen
import com.unrelatedentities.skycast.ui.theme.SkyCastTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SkyCastTheme {
                val navController = rememberNavController()

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = "weather_details_screen"
                    ) {
                        composable("weather_details_screen") {
                            WeatherDetailsScreen()
                        }
                        composable("1") {
                            // TODO: Second screen
                        }
                        /* ... Etc. */
                    }

                }
            }
        }
    }
}