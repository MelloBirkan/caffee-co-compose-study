package com.example.caffeeco.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.caffeeco.ui.theme.CaffeeCoTheme

@Composable
fun MyFirstComposable() {
  Column(
    Modifier
      .padding(8.dp)
      .background(Color.Red)
      .padding(8.dp)
      .fillMaxWidth()
      .fillMaxHeight()
  ) {
    Text("My first Composable")

    Text("Meu segundo texto maior")

    Row(
      Modifier
        .padding(horizontal = 8.dp, vertical = 16.dp)
        .background(Color.Green)
        .fillMaxWidth(0.5f)
    ) {
      Text("Texto 1")
      Text("Texto 2")
    }
  }
}

@Composable
fun Challenge1(modifier: Modifier = Modifier) {
  Row(
    modifier
      .fillMaxWidth()
      .height(200.dp)
  ) {
    Box(
      modifier
        .width(100.dp)
        .fillMaxHeight()
        .background(Color.Blue)
    )

    Column {
      TextTest("Test 1",
        modifier
          .background(Color.LightGray)
          .fillMaxWidth())

      TextTest("Test 2")
    }
  }
}

@Composable
private fun TextTest(text: String, modifier: Modifier = Modifier) {
  Text(
    text,
    modifier
      .padding(16.dp)
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  CaffeeCoTheme {
    Challenge1()
  }
}