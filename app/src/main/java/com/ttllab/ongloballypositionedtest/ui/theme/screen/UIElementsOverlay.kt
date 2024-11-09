package com.ttllab.ongloballypositionedtest.ui.theme.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.ttllab.ongloballypositionedtest.util.UIElementsTracker

@Composable
fun UIElementsOverlay(
    modifier: Modifier = Modifier,
) {
    val density = LocalDensity.current

    Box(modifier = modifier.fillMaxSize()) {
        UIElementsTracker.elements
            .forEach { element ->
                Box(
                    modifier = Modifier
                        .offset(
                            x = with(density) { element.value.rect.left.toDp() },
                            y = with(density) { element.value.rect.top.toDp() },
                        )
                        .size(
                            width = with(density) { element.value.rect.width.toDp() },
                            height = with(density) { element.value.rect.height.toDp() }
                        )
                        .border(width = 5.dp, color = Color.Green)
                )
            }
    }
}