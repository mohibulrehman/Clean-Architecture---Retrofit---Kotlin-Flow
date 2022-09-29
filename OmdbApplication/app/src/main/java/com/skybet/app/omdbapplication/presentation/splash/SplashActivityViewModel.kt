package com.skybet.app.omdbapplication.presentation.splash

import androidx.lifecycle.ViewModel
import com.skybet.app.omdbapplication.domain.SampleUseCase
import com.skybet.app.omdbapplication.presentation.State
import com.skybet.app.omdbapplication.utils.Utils

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class SplashActivityViewModel @Inject constructor(private val sampleUseCase: SampleUseCase) :
    ViewModel() {

    fun getSampleResponse() = flow {
        emit(State.LoadingState)
        try {
            delay(1000)
            
            emit(State.DataState(sampleUseCase.getImages()))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Utils.resolveError(e))
        }
    }
}