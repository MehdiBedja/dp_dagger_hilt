
package com.plcoding.daggerhiltcourse.di

import com.example.learning.data.repository.MyRepositoryImplementation
import com.example.learning.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImplementation: MyRepositoryImplementation
    ): MyRepository
}
