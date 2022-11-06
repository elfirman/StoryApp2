package com.elfirman.storyapp.ui.home

import androidx.lifecycle.*
import androidx.paging.ExperimentalPagingApi
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.elfirman.storyapp.data.AuthRepository
import com.elfirman.storyapp.data.StoryRepository
import com.elfirman.storyapp.data.local.entity.Story
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@ExperimentalPagingApi
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val storyRepository: StoryRepository,
    private val authRepository: AuthRepository

) : ViewModel() {

    fun getAllStories(token: String): LiveData<PagingData<Story>> =
        storyRepository.getAllStories(token).cachedIn(viewModelScope).asLiveData()
}