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
            "Located across from the Gates-Dell Complex and at the heart of campus, Welch Hall " +
                    "is the newly renovated hub for the Chemistry Department. It features some of the largest " +
                    "lecture halls on campus and a variety of public study spaces.",
            mutableListOf(StudyRoom("Welch Lobby", "3/5", "3.5/5",
                "Area gets busy in between classes", "4/5")),
            "https://cm.utexas.edu/resources/room-reservations"
        ),
        StudySpot(
            R.drawable.eer,
            "Engineering Education and Research Center (EER)",
            "2501 Speedway, Austin, TX 78712",
            "The EER is located at the Northern tip of campus where Dean Keeton and Speedway " +
                    "intersect. The first and second floors make up a huge, open lobby area where students" +
                    " from all different majors can be found studying.",
            mutableListOf(StudyRoom("EER Lobby", "2/5", "3/5",
                "Spans floors 1 and 2.", "2.5/5")),
            ""
        ),
        StudySpot(
            R.drawable.energy,
            "Gary L. Thomas Energy Engineering Building (GLT)",
            "210 E 24th St, Austin, TX 78712",
            "Located just steps away from the EER, the energy building is the newest edition to the " +
                    "engineering quad, opening to the public in the Fall of 2022. There are " +
                    "conference rooms sprinkled across its 184,000 square feet of space and a lounge with " +
                    "180 degree windows that feature a stunning view of campus.",
            mutableListOf(StudyRoom("TODO", "2/5", "3/5",
                "TODO.", "2.5/5")),
            ""
        ),
        StudySpot(
            R.drawable.gdc,
            "Gates Dell Complex (GDC)",
            "2317 SPEEDWAY, AUSTIN, TX 78712",
            "The Gates-Dell Complex can be found at the center of Speedway, located across from Welch and " +
                    "facing towards the UT Tower. There are seven floors in the GDC with public study areas and a balcony " +
                    "on each of floors 3-6, as well as a computer lab and a back patio.",
                    mutableListOf(StudyRoom("GDC Lobby", "2/5", "2/5",
                "Location of newly opened Lucky Lab.", "2.5/5")),
            "https://www.cs.utexas.edu/department-info/room-reservations"
        ),
        StudySpot(
            R.drawable.geoscience_student_center,
            "Jackson Geological Sciences Building (JGB)",
            "2305 SPEEDWAY, AUSTIN, TX 78712",
            "The Jackson Geosciences Building is tucked away behind the GDC and is" +
                    " the location of a wide range of study areas including a student center off the " +
                    "front patio and a library on the second floor.",
            mutableListOf(StudyRoom("Holland Family Student Center", "2.5/5", "3/5",
                "Enter from the outdoor patio on the South side of JGB", "2/5"),
                StudyRoom("Geosciences library", "1/5", "3/5",
                    "Group study tables and individual tables are scattered around the library.", "2/5")),
            ""
        ),
        StudySpot(
                R.drawable.pcl_stem_area,
        "Perry-Castañeda Library (PCL)",
        "101 E. 21st Street\n" +
                "Austin, Texas 78712",
        "The PCL is the largest on-campus library, located at the Southern tip of Speedway and featuring " +
                "six floors, each with its own personality and set of unique study areas.",
        mutableListOf(StudyRoom("Learning labs", "4/5", "4/5",
            "Tucked behind the elevators on the entry level of the PCL", "4/5"),
            StudyRoom("Private study rooms", "1/5", "4/5",
                "Private rooms available for reservation on floors 2-6.", "Private")),
            "https://www.lib.utexas.edu/study-spaces-technology/reserve-study-room"
    )
    )
}
