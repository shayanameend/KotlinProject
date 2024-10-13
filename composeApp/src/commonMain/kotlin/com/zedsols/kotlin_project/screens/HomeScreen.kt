package com.zedsols.kotlin_project.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(paddingValues: PaddingValues) {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .padding(paddingValues),
    horizontalAlignment = Alignment
      .CenterHorizontally,
  ) {
    Button(
      onClick = { }
    ) {
      Text("Click me!")
    }
  }
}