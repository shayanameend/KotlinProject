package com.zedsols.kotlin_project.widgets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable


@Composable
fun AppFloatingActionButton() {
  FloatingActionButton(
    onClick = {
      println("FAB Clicked")
    },
  ) {
    Icon(
      imageVector = Icons.Filled.Add,
      contentDescription = "Add",
    )
  }
}