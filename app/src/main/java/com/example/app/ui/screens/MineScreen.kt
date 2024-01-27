package com.example.app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.app.ui.components.TopAppBar

@Composable
fun MineScreen(
    statusBarHeight: Int
) {
    Column(modifier = Modifier) {
        TopAppBar(
            modifier = Modifier,
            statusBarHeight
        ) {
            Text(text = "我的", color = Color.White)
        }
        Text(text = "我的页")
    }
}

@Preview
@Composable
fun MineScreenPreview() {
    MineScreen(20)
}