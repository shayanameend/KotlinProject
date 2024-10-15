package com.zedsols.kotlin_project


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.zedsols.kotlin_project.screens.HomeScreen
import com.zedsols.kotlin_project.screens.SettingsScreen
import com.zedsols.kotlin_project.widgets.AppBottomBar
import com.zedsols.kotlin_project.widgets.AppFloatingActionButton
import com.zedsols.kotlin_project.widgets.AppTopBar


data class ScreenContent(
    val label: String,
    val icon: ImageVector,
    val screen: @Composable (paddingValues: PaddingValues) -> Unit
)


@Composable
fun App() {
    val selectedIndex: MutableState<Int> = remember {
        mutableStateOf(value = 0)
    }

    val screenContents: List<ScreenContent> = listOf(
        ScreenContent(
            label = "Home",
            icon = Icons.Filled.Home,
            screen = { paddingValues: PaddingValues ->
                HomeScreen(paddingValues)
            }
        ),
        ScreenContent(
            label = "Settings",
            icon = Icons.Filled.Settings,
            screen = { paddingValues: PaddingValues ->
                SettingsScreen(paddingValues)
            }
        ),
    )

    MaterialTheme {
        Scaffold(
            topBar = {
                AppTopBar(
                    title = screenContents[selectedIndex.value].label,
                )
            },
            bottomBar = {
                AppBottomBar(
                    selectedIndex = selectedIndex,
                    screenContents = screenContents,
                )
            },
            floatingActionButton = {
                AppFloatingActionButton()
            },
        ) { paddingValues: PaddingValues ->
            screenContents[selectedIndex.value].screen(
                paddingValues,
            )
        }
    }
}