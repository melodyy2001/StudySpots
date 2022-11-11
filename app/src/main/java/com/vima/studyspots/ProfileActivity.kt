package com.vima.studyspots

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vima.studyspots.adapters.StudySpotAdapter
import com.vima.studyspots.databinding.ActivityProfileBinding
import com.vima.studyspots.model.StudyRoom
import com.vima.studyspots.model.StudySpot

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private var roomIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spotID = getIntent().getStringExtra("Position")?.toInt()
        val curData = StudySpotAdapter.getStudySpotList(spotID!!)
        val firstRoom = curData.studyRooms[0]
        binding.name.text = curData.name
        binding.location.text = curData.location
        binding.imagePreview.setImageDrawable(getResources().getDrawable(curData.imageResourceId))
        binding.description.text = "Description: " + curData.description
        setRoom(firstRoom)
        binding.roomButtonRight.setOnClickListener {
            goToNextRoom(curData)
        }
        binding.roomButtonLeft.setOnClickListener {
            goToPrevRoom(curData)
        }

    }

    private fun goToPrevRoom(building: StudySpot) {
        roomIndex--
        if (roomIndex == -1) {
            roomIndex = building.studyRooms.size - 1
        }
        setRoom(building.studyRooms[roomIndex])
    }

    private fun goToNextRoom(building: StudySpot) {
        roomIndex++
        if (roomIndex == building.studyRooms.size) {
            roomIndex = 0
        }
        setRoom(building.studyRooms[roomIndex])
    }

    fun setRoom(curRoom: StudyRoom) {
        binding.roomName.text = curRoom.name
        binding.noiseLevel.text = "Noise level: " + curRoom.noiseLevel
        binding.comfortability.text = "Comfortability: " + curRoom.comfortability
        binding.roomDescription.text = "About: " + curRoom.description
        binding.footTraffic.text = "Foot traffic: " + curRoom.footTraffic
    }
}