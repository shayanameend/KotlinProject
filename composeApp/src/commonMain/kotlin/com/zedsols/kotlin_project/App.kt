package com.zedsols.kotlin_project

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import com.zedsols.kotlin_project.views.Home
import com.zedsols.kotlin_project.views.TopBar

@Composable
fun App() {
  MaterialTheme {
    Scaffold(
      topBar = { TopBar() },
    ) {
      Home()
    }
  }
}