package com.ttllab.ongloballypositionedtest.ui.theme.screen

import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@Composable
fun ItemsView(
    pageIndex: Int,
    modifier: Modifier = Modifier,
) {
    var scale by remember { mutableFloatStateOf(1f) }
    var offset by remember { mutableStateOf(Offset.Zero) }
    val configuration = LocalConfiguration.current
    val density = LocalDensity.current
    val screenWidth = with(density) { configuration.screenWidthDp.dp.toPx() }
    val screenHeight = with(density) { configuration.screenHeightDp.dp.toPx() }

    Box(
        modifier = modifier
            .fillMaxSize()
//            .pointerInput(pageIndex) { // Uncomment to check zooming
//                detectTransformGestures { _, pan, zoom, _ ->
//                    scale = (scale * zoom).coerceAtLeast(1f)
//                    val boundsX = (screenWidth * scale - screenWidth) / 2
//                    val boundsY = (screenHeight * scale - screenHeight) / 2
//                    offset = Offset(
//                        x = (offset.x + pan.x).coerceIn(-boundsX, boundsX),
//                        y = (offset.y + pan.y).coerceIn(-boundsY, boundsY),
//                    )
//                }
//            }
//            .graphicsLayer {
//                scaleX = scale
//                scaleY = scale
//                translationX = offset.x
//                translationY = offset.y
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