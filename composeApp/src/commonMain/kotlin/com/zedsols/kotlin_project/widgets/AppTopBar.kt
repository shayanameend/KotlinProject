package com.zedsols.kotlin_project.widgets


import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(selectedIndex: MutableState<Int>) {
  TopAppBar(
    title = {
      Text(
        text = when (selectedIndex.value) {
          0 -> "Home"
          1 -> "Settings"
          else -> ""
        }
      )
    },
  )
}