package com.morfly.sample.images.impl.di

import com.morfly.sample.images.impl.GetEmptyFeed
import com.morfly.sample.images.impl.GetEmptyFeedUseCase
import com.morfly.sample.images.impl.GetImages
import com.morfly.sample.images.impl.GetImagesUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
interface ImagesModule {
    @Binds
    fun bindGetImage(impl: GetImagesUseCase): GetImages

    @Binds
    fun bindGetEmptyFeed(impl: GetEmptyFeedUseCase): GetEmptyFeed
}
