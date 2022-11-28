package com.vima.studyspots

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
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
        if (curData.studyRooms.size == 1) {
            binding.roomButtonLeft.setVisibility(View.INVISIBLE)
            binding.roomButtonRight.setVisibility(View.INVISIBLE)
        } else {
            binding.roomButtonLeft.setOnClickListener {
                goToPrevRoom(curData)
            }

            binding.buttonBookRoom.setOnClickListener {
                goToWebsite(curData)
            }
        }

    }

    private fun goToWebsite(building: StudySpot) {
        if (building.bookURL == "") {
            Toast.makeText(applicationContext, "No bookings available", Toast.LENGTH_SHORT).show()
        } else {
            val webIntent: Intent = Uri.parse(building.bookURL).let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)
        }
    }

    fun ObjectAnimator.disableDuringAnimation(view: View) {
        addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationStart(animation: Animator?) {
                view.isEnabled = false
            }
            override fun onAnimationEnd(animation: Animator?) {
                view.isEnabled = true
            }
        })
    }

    private fun goToPrevRoom(building: StudySpot) {
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 2f)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 2f)
        val animator = ObjectAnimator.ofPropertyValuesHolder(binding.roomButtonLeft, scaleX, scaleY)
        animator.repeatCount = 1
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.disableDuringAnimation(binding.roomButtonLeft)
        animator.start()
        roomIndex--
        if (roomIndex == -1) {
            roomIndex = building.studyRooms.size - 1
        }
        setRoom(building.studyRooms[roomIndex])
    }

    private fun goToNextRoom(building: StudySpot) {
        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.5f)
        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.5f)
        val animator = ObjectAnimator.ofPropertyValuesHolder(binding.roomButtonRight, scaleX, scaleY)
        animator.repeatCount = 1
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.disableDuringAnimation(binding.roomButtonRight)
        animator.start()
        roomIndex++
        if (roomIndex == building.studyRooms.size) {
            roomIndex = 0
        }
        setRoom(building.studyRooms[roomIndex])
    }

    fun setRoom(curRoom: StudyRoom) {
        binding.roomName.text = "Space: " + curRoom.name
        binding.noiseLevel.text = "Noise level: " + curRoom.noiseLevel
        binding.comfortability.text = "Comfortability: " + curRoom.comfortability
        binding.roomDescription.text = "About: " + curRoom.description
        binding.footTraffic.text = "Foot traffic: " + curRoom.footTraffic
    }
}