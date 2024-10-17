package com.zedsols.kotlin_project.widgets


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState


@Composable
fun AppFloatingActionButton(
  selectedIndex: MutableState<Int>,
) {
  FloatingActionButton(
    onClick = {
      println(
        "${
          when (selectedIndex.value) {
            0 -> "Home"
            1 -> "Settings"
            else -> ""
          }
        } FAB Clicked"
      )
    },
  ) {
    Icon(
      imageVector = Icons.Filled.Add,
      contentDescription = "Add",
    )
  }
}