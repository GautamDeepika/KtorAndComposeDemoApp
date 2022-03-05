package com.example.myktordemoapp.presentation.screens.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems

@Composable
fun HomeScreen(
    homeVM: HomeVM = hiltViewModel()
) {

    val allHeroes = homeVM.getAllHeroes.collectAsLazyPagingItems()



    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {})
        }
    ) {}
}