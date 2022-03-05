package com.example.myktordemoapp.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.example.myktordemoapp.domain.use_cases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeVM @Inject constructor(
    useCases: UseCases
) : ViewModel() {

    val getAllHeroes = useCases.getAllHeroesUseCase()



}