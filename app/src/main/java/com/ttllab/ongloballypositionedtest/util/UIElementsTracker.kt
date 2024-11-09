package com.ttllab.ongloballypositionedtest.util

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInRoot
import java.util.concurrent.ConcurrentHashMap

object UIElementsTracker {
    private val _elements = ConcurrentHashMap<String, UIElementData>()
    val elements: Map<String, UIElementData> get() = _elements

    // 要素を追加または更新するメソッド
    fun updateElement(
        id: String,
        coordinates: LayoutCoordinates,
        zIndex: Float = 0f,
        action: () -> Unit = {}
    ) {
        val value = UIElementData(coordinates, zIndex, action)
        _elements[id] = value
    }

    // 要素を削除するメソッド
    fun removeElement(id: String) {
        _elements.remove(id)
    }

    // 特定のIDの要素を取得するメソッド
    fun getElementById(id: String): UIElementData? {
        return _elements[id]
    }

    // 特定の座標を入れた時に、その座標を含んでいる要素を取得するメソッド
    // zIndexが大きい順に並べる
    fun getElementByPosition(x: Float, y: Float): Collection<UIElementData> {
        return _elements.values.filter { coordinates ->
            coordinates.coordinates.boundsInRoot().contains(x, y)
        }.sortedByDescending { it.zIndex }
    }

    private fun Rect.contains(x: Float, y: Float): Boolean {
        return x in left..right && y in top..bottom
    }
}

data class UIElementData(
    val coordinates: LayoutCoordinates,
    val zIndex: Float = 0f,
    val action: () -> Unit = {}
)