package com.dineshworkspace.panvalidator.pan

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dineshworkspace.panvalidator.base.BaseViewModel
import com.dineshworkspace.panvalidator.validator.PanCardValidator
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PanViewModel @Inject constructor(private val panCardValidator: PanCardValidator) :
    BaseViewModel() {

    val isValidPan: MutableLiveData<Boolean> = MutableLiveData()

    fun validatePanCard(panData: String) {
        viewModelScope.launch {
            isValidPan.postValue(panCardValidator.validatePanCard(panData))
        }
    }

}