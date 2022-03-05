package com.example.myktordemoapp.presentation.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.myktordemoapp.presentation.components.RatingWidget
import com.example.myktordemoapp.ui.theme.LARGE_PADDING

@Composable
fun HomeScreen(
    homeVM: HomeVM = hiltViewModel()
) {

    val allHeroes = homeVM.getAllHeroes.collectAsLazyPagingItems()



    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {})
        }
    ) {
        RatingWidget(
            modifier = Modifier.padding(LARGE_PADDING),
            rating = 4.1
        )
    }
}