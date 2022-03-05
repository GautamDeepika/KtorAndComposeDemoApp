package com.example.myktordemoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.example.myktordemoapp.data.repository.Repository
import com.example.myktordemoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<PagingData<Hero>>{
        return repository.getAllHeroes()
    }
}