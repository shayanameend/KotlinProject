package com.zedsols.kotlin_project

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.zedsols.kotlin_project.screens.HomeScreen
import com.zedsols.kotlin_project.widgets.AppBottomBar
import com.zedsols.kotlin_project.widgets.AppFloatingActionButton
import com.zedsols.kotlin_project.widgets.AppTopBar


@Composable
fun App() {
    MaterialTheme {
        val selectedIndex = remember {
            mutableStateOf(0)
        }

        Scaffold(
            topBar = { AppTopBar() },
            bottomBar = { AppBottomBar(selectedIndex) },
            floatingActionButton = { AppFloatingActionButton() },
        ) { paddingValues: PaddingValues -> HomeScreen(paddingValues) }
    }
}