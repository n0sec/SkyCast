package com.unrelatedentities.skycast

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun SkyCastApp() {
    Scaffold(bottomBar = { AppBottomNavigation() }) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding))
    }
}

@Composable
fun AppBottomNavigation(modifier: Modifier = Modifier) {
    BottomNavigation(
        modifier = modifier,
        content = {
            BottomNavigationItem(
                selected = true,
                icon = {/* TODO */ },
                onClick = { /*TODO*/ })
        },
        backgroundColor = MaterialTheme.colorScheme.surface,
        elevation = Dp(3.0f)
    )
}