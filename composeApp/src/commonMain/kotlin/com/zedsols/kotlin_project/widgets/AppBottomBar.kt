package com.zedsols.kotlin_project.widgets


import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.zedsols.kotlin_project.ScreenContent


@Composable
fun AppBottomBar(
  selectedIndex: MutableState<Int>,
  screenContents: List<ScreenContent>,
) {
  BottomAppBar {
    screenContents.forEachIndexed { index, item ->
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