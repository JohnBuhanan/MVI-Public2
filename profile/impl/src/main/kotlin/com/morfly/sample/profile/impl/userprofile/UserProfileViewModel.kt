package com.morfly.sample.profile.impl.userprofile

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.morfly.sample.common.domain.Image
import com.morfly.sample.common.domain.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class UserProfileViewModel @Inject constructor(
    private val getUserImages: GetUserImages,
    private val getMyImages: GetMyImages,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private val userId = savedStateHandle.get<String>("userId")
    val isMyProfile = userId == null
    val showSettingsButton = userId == null
    val screenTitle = if (isMyProfile) "My Profile" else "Profile"

    private val mutableAvatarUrl = MutableStateFlow<String?>(null)
    val avatarUrl: StateFlow<String?> = mutableAvatarUrl

    private val mutableUsername = MutableStateFlow<String?>(null)
    val username: StateFlow<String?> = mutableUsername


    fun images(): Flow<List<Image>> {
        val imagesFlow =
            if (userId != null) getUserImages(userId)
            else getMyImages()

        return imagesFlow.onEach { images ->
            val user = images.firstOrNull()?.user
            if (user != null) updateUserInfo(user)
        }
    }

    private fun updateUserInfo(user: User) {
        mutableAvatarUrl.value = user.imageUrl
        mutableUsername.value = user.name
    }
}
