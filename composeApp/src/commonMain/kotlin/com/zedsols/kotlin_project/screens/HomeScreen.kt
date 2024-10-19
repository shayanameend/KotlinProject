package com.zedsols.kotlin_project.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(
  paddingValues: PaddingValues,
  selectedIndex: MutableState<Int>,
) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(paddingValues),
    horizontalAlignment = Alignment
      .CenterHorizontally,
    verticalArrangement = Arrangement
      .Center,
  ) {
    Text(
      when (selectedIndex.value) {
        0 -> "Home"
        1 -> "Settings"
        else -> ""
      }
    )
  }
}