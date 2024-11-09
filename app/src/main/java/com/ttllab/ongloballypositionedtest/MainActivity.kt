package com.ttllab.ongloballypositionedtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.ttllab.ongloballypositionedtest.ui.theme.ItemsView
import com.ttllab.ongloballypositionedtest.ui.theme.OnGloballyPositionedTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OnGloballyPositionedTestTheme {
                Surface {
                    PagerItemsView()
                }
            }
        }
    }
}
