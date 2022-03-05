package com.example.myktordemoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.myktordemoapp.data.local.dao.HeroDao
import com.example.myktordemoapp.data.local.dao.HeroRemoteKeyDao
import com.example.myktordemoapp.domain.model.Hero
import com.example.myktordemoapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {


    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}