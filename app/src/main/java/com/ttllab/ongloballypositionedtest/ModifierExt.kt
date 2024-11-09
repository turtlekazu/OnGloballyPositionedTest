package com.ttllab.ongloballypositionedtest

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import java.util.UUID

@Composable
fun Modifier.trackable(id: Int = UUID.randomUUID().hashCode()): Modifier {
    DisposableEffect(
        Unit
    ) {
        onDispose {
            UIElementsTracker.removeElement(id.toString())
        }
    }

    return this then Modifier.onGloballyPositioned { coordinates ->
        UIElementsTracker.updateElement(id.toString(), coordinates)
        Log.d("ItemView", "elements size = ${UIElementsTracker.elements.size}")
    }
}