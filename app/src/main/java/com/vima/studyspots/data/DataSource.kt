package com.vima.studyspots.data

import com.vima.studyspots.R
import com.vima.studyspots.model.StudySpot


object DataSource {
    // list of the members and their contents
    val studySpots: List<StudySpot> = listOf(
        StudySpot(
            R.drawable.welch,
            "Robert A. Welch Hall (WEL)",
            "105 E 24th St, Austin, TX 78705",
            2.0/5
        ),
        StudySpot(
            R.drawable.eer,
            "Engineering Education and Research Center (EER)",
            "2501 Speedway, Austin, TX 78712",
            2.5/5
        ),
        StudySpot(
            R.drawable.energy,
            "Gary L. Thomas Energy Engineering Building (GLT)",
            "210 E 24th St, Austin, TX 78712",
            1.0/5
        ),
        StudySpot(
            R.drawable.gdc,
            "Gates Dell Complex (GDC)",
            "2317 SPEEDWAY, AUSTIN, TX 78712",
            4.3/5
        )
    )
}
