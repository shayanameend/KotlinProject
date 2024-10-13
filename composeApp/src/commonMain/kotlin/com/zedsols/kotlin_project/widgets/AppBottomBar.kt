package com.zedsols.kotlin_project.widgets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AppBottomBar() {
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
      selected = true,
      onClick = { },
    )
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
      selected = true,
      onClick = { },
    )
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
      selected = true,
      onClick = { },
    )
  }
}