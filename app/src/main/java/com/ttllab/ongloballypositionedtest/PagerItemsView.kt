package com.ttllab.ongloballypositionedtest

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ttllab.ongloballypositionedtest.ui.theme.ItemsView

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerItemsView(
    modifier: Modifier = Modifier,
) {
    val pagerState = rememberPagerState { 5 }
    HorizontalPager(
        state = pagerState,
        modifier = modifier,
    ) { page ->
        ItemsView(pageIndex = page)
    }
}