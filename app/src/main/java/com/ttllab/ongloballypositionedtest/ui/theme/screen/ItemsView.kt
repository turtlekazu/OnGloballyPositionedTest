package com.ttllab.ongloballypositionedtest.ui.theme.screen

import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput

@Composable
fun ItemsView(
    pageIndex: Int,
    modifier: Modifier = Modifier,
) {
    var scale by remember { mutableFloatStateOf(1f) }

    Box(
        modifier = modifier
            .fillMaxSize()
//            .pointerInput(Unit) { // Uncomment to check zooming
//                detectTransformGestures { _, _, zoom, _ ->
//                    scale *= zoom
//                    scale = scale.coerceAtLeast(0.7f)
//                }
//            }
//            .graphicsLayer {
//                scaleX = scale
//                scaleY = scale
//            }
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