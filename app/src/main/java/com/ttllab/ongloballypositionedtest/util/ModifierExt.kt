package com.ttllab.ongloballypositionedtest.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import java.util.UUID

@Composable
fun Modifier.trackable(
    id: Int = UUID.randomUUID().hashCode(),
    zIndex: Float = 0f,
    action: () -> Unit = {},
): Modifier {
    DisposableEffect(
        Unit
    ) {
        onDispose {
            UIElementsTracker.removeElement(id.toString())
        }
    }

    return this then Modifier.onGloballyPositioned { coordinates ->
        UIElementsTracker.updateElement(id.toString(), coordinates, zIndex, action)
    }
}