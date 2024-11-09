package com.ttllab.ongloballypositionedtest.ui.theme.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun ItemsView(
    pageIndex: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
//            .graphicsLayer { // Uncomment this for scaling check
//                scaleX = 2f
//                scaleY = 2f
//            }
//            .scale(2f) // Uncomment this for scaling check
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
        ) {
            items(100) {
                ItemView(id = (it + pageIndex * 20))
            }
        }
    }
}