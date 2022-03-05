package com.example.myktordemoapp.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.myktordemoapp.data.local.BorutoDatabase
import com.example.myktordemoapp.data.paging_source.HeroRemoteMediator
import com.example.myktordemoapp.data.remote.BorutoApi
import com.example.myktordemoapp.domain.model.Hero
import com.example.myktordemoapp.domain.repository.RemoteDataSource
import com.example.myktordemoapp.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class RemoteDataSourceImpl(
    private val borutoApi: BorutoApi,
    private val borutoDatabase: BorutoDatabase
) : RemoteDataSource {

    private val heroDao = borutoDatabase.heroDao()


    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        val pagingSourceFactory = { heroDao.getAllHeroes() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = HeroRemoteMediator(
                borutoApi = borutoApi,
                borutoDatabase = borutoDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow

    }

    override fun searchHero(): Flow<PagingData<Hero>> {
        TODO("Not yet implemented")
    }
}