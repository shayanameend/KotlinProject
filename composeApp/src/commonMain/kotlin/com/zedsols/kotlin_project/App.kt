package com.zedsols.kotlin_project

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.zedsols.kotlin_project.screens.HomeScreen
import com.zedsols.kotlin_project.widgets.AppBottomBar
import com.zedsols.kotlin_project.widgets.AppTopBar

@Composable
fun App() {
    MaterialTheme {
        Scaffold(
            topBar = { AppTopBar() },
            bottomBar = { AppBottomBar() },
        ) { paddingValues: PaddingValues -> HomeScreen(paddingValues) }
    }
}