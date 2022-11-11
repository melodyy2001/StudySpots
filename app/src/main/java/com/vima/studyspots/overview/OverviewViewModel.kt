package com.vima.studyspots.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vima.studyspots.network.RoomApi
import com.vima.studyspots.network.RoomApiService
import kotlinx.coroutines.launch

class OverviewViewModel: ViewModel() {
    private val _status = MutableLiveData<String>()

    val status: LiveData<String> = _status

    init{
        getBookingRoom()
    }

    private fun getBookingRoom(){
        viewModelScope.launch {
            // for when not connected to the internet
            try {
                val listResult = RoomApi.retrofitService.getBookRoom()
                _status.value = listResult
            } catch (e: Exception){
                _status.value = "Failure: ${e.message}"

            }
        }
        // nothing about UI is on hold, happening in the background while coroutine finishes
        _status.value = "Loading Rooms..."
    }

}