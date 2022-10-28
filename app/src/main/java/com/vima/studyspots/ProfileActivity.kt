package com.vima.studyspots

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vima.studyspots.adapters.StudySpotAdapter
import com.vima.studyspots.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spotID = getIntent().getStringExtra("Position")?.toInt()
        val curData = StudySpotAdapter.Companion.getStudySpotList(spotID!!)

        binding.name.text = curData.name
        binding.location.text = curData.location
        binding.imagePreview.setImageDrawable(getResources().getDrawable(curData.imageResourceId))
        binding.noiseLevel.text = curData.noiseLevel.toString()

    }
}