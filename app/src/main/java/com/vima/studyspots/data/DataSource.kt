package com.vima.studyspots.data

import com.vima.studyspots.R
import com.vima.studyspots.model.StudyRoom
import com.vima.studyspots.model.StudySpot


object DataSource {
    // list of the members and their contents
    val studySpots: List<StudySpot> = listOf(
        StudySpot(
            R.drawable.welch,
            "Robert A. Welch Hall (WEL)",
            "105 E 24th St, Austin, TX 78705",
            "Located across from the Gates-Dell Complex and at the heart of campus, Welch Hall" +
                    "is the newly renovated hub for the Chemistry Department. It features some of the largest" +
                    "lecture halls on campus and a variety of public study spaces.",
            mutableListOf(StudyRoom("Welch Lobby", "3/5", "3.5/5",
                "Area gets busy in between classes", "4/5"))
        ),
        StudySpot(
            R.drawable.eer,
            "Engineering Education and Research Center (EER)",
            "2501 Speedway, Austin, TX 78712",
            "The EER is located at the Northern tip of campus where Dean Keeton and Speedway" +
                    "intersect. The first and second floors make up a huge, open lobby area where students" +
                    " from all different majors can be found studying.",
            mutableListOf(StudyRoom("EER Lobby", "2/5", "3/5",
                "Spans floors 1 and 2.", "2.5/5"))
        ),
        StudySpot(
            R.drawable.energy,
            "Gary L. Thomas Energy Engineering Building (GLT)",
            "210 E 24th St, Austin, TX 78712",
            "Located just steps away from the EER, the energy building is the newest edition to the" +
                    "engineering quad, opening to the public in the Fall of 2022. There are " +
                    "conference rooms sprinkled across its 184,000 square feet of space and a lounge with" +
                    "180 degree windows that feature a stunning view of campus.",
            mutableListOf(StudyRoom("TODO", "2/5", "3/5",
                "TODO.", "2.5/5"))
        ),
        StudySpot(
            R.drawable.gdc,
            "Gates Dell Complex (GDC)",
            "2317 SPEEDWAY, AUSTIN, TX 78712",
            "The Gates-Dell Complex can be found at the center of Speedway, located across from Welch and " +
                    "facing towards the UT Tower. There are seven floors in the GDC with public study areas and a balcony" +
                    "on each of floors 3-6, as well as a computer lab and a back patio.",
                    mutableListOf(StudyRoom("GDC Lobby", "2/5", "2/5",
                "Location of newly opened Lucky Lab.", "2.5/5"))
        )
    )
}
