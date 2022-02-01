package com.morfly.sample.data.impl.di

import com.morfly.sample.common.domain.ImagesRepository
import com.morfly.sample.common.domain.UsersRepository
import com.morfly.sample.data.impl.DefaultImagesRepository
import com.morfly.sample.data.impl.FakeUsersRepository
import com.morfly.sample.data.impl.mapping.DataMapper
import com.morfly.sample.data.impl.mapping.DefaultDataMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface DataModule {
    @Binds
    @Singleton
    fun mapper(impl: DefaultDataMapper): DataMapper

    @Binds
    @Singleton
    fun imagesRepository(impl: DefaultImagesRepository): ImagesRepository

    @Binds
    @Singleton
    fun usersRepository(impl: FakeUsersRepository): UsersRepository
}
