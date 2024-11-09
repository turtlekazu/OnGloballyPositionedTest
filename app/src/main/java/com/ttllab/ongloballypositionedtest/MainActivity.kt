package com.ttllab.ongloballypositionedtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.ttllab.ongloballypositionedtest.ui.theme.OnGloballyPositionedTestTheme
import com.ttllab.ongloballypositionedtest.ui.theme.screen.MainScreen
import com.ttllab.ongloballypositionedtest.ui.theme.screen.PagerItemsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OnGloballyPositionedTestTheme {
                Surface {
                    MainScreen()
                }
            }
        }
    }
}
