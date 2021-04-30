package com.dineshworkspace.panvalidator.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel

abstract class BaseViewModel() : ViewModel(), LifecycleObserver {

    override fun onCleared() {
        super.onCleared()
    }

}