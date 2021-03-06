package com.morfly.sample.profile.impl.userprofile.di

import com.morfly.sample.profile.impl.userprofile.GetMyImages
import com.morfly.sample.profile.impl.userprofile.GetMyImagesUseCase
import com.morfly.sample.profile.impl.userprofile.GetUserImages
import com.morfly.sample.profile.impl.userprofile.GetUserImagesUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
interface UserProfileModule {

    @Binds
    fun getUserImages(impl: GetUserImagesUseCase): GetUserImages

    @Binds
    fun getMyImages(impl: GetMyImagesUseCase): GetMyImages
}
