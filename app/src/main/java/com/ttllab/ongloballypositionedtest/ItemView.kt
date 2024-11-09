package com.ttllab.ongloballypositionedtest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ItemView(
    id: Int,
    modifier: Modifier = Modifier,
) {
    val red = (id * 10 + 30) % 255
    val green = (id * 20 + 50) % 255
    val blue = (id * 30 + 70) % 255
    val color = Color(red, green, blue)

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .aspectRatio(1f)
            .fillMaxWidth()
            .background(color)
            .trackable(id)
    ) {
        Text("Item $id")
    }
}