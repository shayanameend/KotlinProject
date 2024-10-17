package com.zedsols.kotlin_project.widgets


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState


@Composable
fun AppBottomBar(
  selectedIndex: MutableState<Int>,
) {
  BottomAppBar {
    NavigationBarItem(
      icon = {
        Icon(
          imageVector = Icons.Filled.Home,
          contentDescription = "Home",
        )
      },
      label = {
        Text("Home")
      },
      selected = selectedIndex.value == 0,
      onClick = {
        selectedIndex.value = 0
      },
    )
    NavigationBarItem(
      icon = {
        Icon(
          imageVector = Icons.Filled.Settings,
          contentDescription = "Settings",
        )
      },
      label = {
        Text("Settings")
      },
      selected = selectedIndex.value == 1,
      onClick = {
        selectedIndex.value = 1
      },
    )
  }
}