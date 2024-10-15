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
import androidx.compose.ui.graphics.vector.ImageVector


data class BottomBarItem(
  val label: String,
  val icon: ImageVector,
)


@Composable
fun AppBottomBar(selectedIndex: MutableState<Int>) {
  val bottomBarItems: List<BottomBarItem> = listOf(
    BottomBarItem(
      label = "Home",
      icon = Icons.Filled.Home,
    ),
    BottomBarItem(
      label = "Settings",
      icon = Icons.Filled.Settings,
    ),
  )

  BottomAppBar {
    bottomBarItems.forEachIndexed { index, item ->
      NavigationBarItem(
        icon = {
          Icon(
            imageVector = item.icon,
            contentDescription = item.label,
          )
        },
        label = {
          Text(item.label)
        },
        selected = selectedIndex.value == index,
        onClick = {
          selectedIndex.value = index
        },
      )
    }
  }
}