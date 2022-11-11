package com.vima.studyspots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.vima.studyspots.adapters.StudySpotAdapter

class StudyListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_list)


        val recyclerView = findViewById<RecyclerView>(R.id.grid_recycler_view)
        var searchTerm = ""
        // Search term will be null on back button
        if (getIntent().getStringExtra("SearchTerm") != null) {
            searchTerm = getIntent().getStringExtra("SearchTerm").toString()
        }

        recyclerView.adapter = StudySpotAdapter(applicationContext, searchTerm!!)

        recyclerView.setHasFixedSize(true)

    }





}