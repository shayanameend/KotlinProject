package com.zedsols.kotlin_project


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.zedsols.kotlin_project.screens.HomeScreen
import com.zedsols.kotlin_project.widgets.AppBottomBar
import com.zedsols.kotlin_project.widgets.AppFloatingActionButton
import com.zedsols.kotlin_project.widgets.AppTopBar


data class ScreenContent(
    val label: String,
    val icon: ImageVector,
)


@Composable
fun App() {
    val selectedIndex: MutableState<Int> = remember {
        mutableStateOf(value = 0)
    }

    MaterialTheme {
        Scaffold(
            topBar = {
                AppTopBar(selectedIndex = selectedIndex)
            },
            bottomBar = {
                AppBottomBar(selectedIndex = selectedIndex)
            },
            floatingActionButton = {
                AppFloatingActionButton(selectedIndex = selectedIndex)
            },
        ) { paddingValues: PaddingValues ->
            HomeScreen(
                paddingValues = paddingValues,
                selectedIndex = selectedIndex,
            )
        }
    }
}