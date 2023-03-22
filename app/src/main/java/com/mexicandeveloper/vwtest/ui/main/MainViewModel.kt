package com.mexicandeveloper.vwtest.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mexicandeveloper.vwtest.models.InfoResponse
import com.mexicandeveloper.vwtest.models.NetworkResult
import com.mexicandeveloper.vwtest.repository.InfoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val infoRepository: InfoRepository) : ViewModel() {
    var _res = MutableLiveData<NetworkResult<InfoResponse>>()

    val res: LiveData<NetworkResult<InfoResponse>>
        get() = _res


    fun getInfo() = viewModelScope.launch {
        _res.postValue(NetworkResult.Loading())
        val call = infoRepository.getInfo()
        if (call.isSuccessful) {
            call.body()?.let {
                _res.postValue(NetworkResult.Success(it))
            }
        } else {
            _res.postValue(NetworkResult.Error(call.errorBody().toString(), null))
        }


    }
}