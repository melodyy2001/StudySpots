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
                "Area gets busy in between classes", "4/5"),
                StudyRoom("Welch Basement", "2/5", "3/5",
                    "Features small tables that fit three and a few benches", "3/5")),
            "https://cm.utexas.edu/resources/room-reservations",
            "WEL",
            0
        ),
        StudySpot(
            R.drawable.eer,
            "Engineering Education and Research Center (EER)",
            "2501 Speedway, Austin, TX 78712",
            "The EER is located at the Northern tip of campus where Dean Keeton and Speedway " +
                    "intersect. The first and second floors make up a huge, open lobby area where students" +
                    " from all different majors can be found studying.",
            mutableListOf(StudyRoom("EER Lobby", "2/5", "3/5",
                "Spans floors 1 and 2.", "2.5/5"),
                StudyRoom("EER private rooms", "1.5/5", "4/5",
                "Located on the first floor behind the main stairs.", "4/5")),
            "",
            "EER",
            1
        ),
        StudySpot(
            R.drawable.energy,
            "Gary L. Thomas Energy Engineering Building (GLT)",
            "210 E 24th St, Austin, TX 78712",
            "Located just steps away from the EER, the energy building is the newest edition to the " +
                    "engineering quad, opening to the public in the Fall of 2022. There are " +
                    "conference rooms sprinkled across its 184,000 square feet of space and a lounge with " +
                    "180 degree windows that feature a stunning view of campus.",
            mutableListOf(StudyRoom("GLT Lounge", "2/5", "4/5",
                "Has one of the best campus views of the UT tower.", "4/5")),
            "",
            "GLT",
            2
        ),
        StudySpot(
            R.drawable.gdc,
            "Gates Dell Complex (GDC)",
            "2317 SPEEDWAY, AUSTIN, TX 78712",
            "The Gates-Dell Complex can be found at the center of Speedway, located across from Welch and " +
                    "facing towards the UT Tower. There are seven floors in the GDC with public study areas and a balcony " +
                    "on each of floors 3-6, as well as a computer lab and a back patio.",
                    mutableListOf(StudyRoom("GDC Lobby", "2/5", "2/5",
                "Location of newly opened Lucky Lab.", "2.5/5"),
                        StudyRoom("GDC Basement Lounge and Lab", "2/5", "3/5",
                            "Lacking in natural light and known for its distinctive smell.", "2.5/5"),
                        StudyRoom("Third floor computer lab", "3.5/5", "3/5",
                            "Location of the CS org lounges and 314 help hours.", "3.5/5")),
            "https://www.cs.utexas.edu/department-info/room-reservations",
            "GDC",
            3
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
            "",
            "JGB",
            4
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
            "https://www.lib.utexas.edu/study-spaces-technology/reserve-study-room",
        "PCL",
            5
        ),
        StudySpot(
            R.drawable.fac,
            "Flawn Academic Center (FAC)",
            "2304 Whitis Ave, Austin, TX 78712",
            "The FAC is not just a library but a place for students to collaborate with each other as there are " +
                    "many collaborative tables. This place is also useful for when your laptop needs to get fixed.",
            mutableListOf(StudyRoom("First Floor","1/5","3/5",
            "There are no study rooms for students to reserve", "2/5")),
        "",
            "FAC",
            6
        ),
        StudySpot(
            R.drawable.nhb,
            "Norman Hackerman Building (NHB)",
            "100 E 24TH ST, AUSTIN, TX 78712",
            "The NHB is a CNS building mainly used for research and development but also has ample study spaces " +
                    " and has quite a few microwaves and fridges.",
            mutableListOf(StudyRoom("Outside","3/5","3/5",
                "Outside of the building there are some lounge areas set up which are shaded as well.", "2/5"),
            StudyRoom("3rd Floor", "1/5", "4/5",
                "This floor has a pretty big study area with collaborative tables and white boards. On the floor there are " +
            "also individual study spaces. There is a fridge and microwave in case anyone needs it.","1/5"),StudyRoom
            ("4th-5th Floor","1/5","4/5","This area does not have a big study collaborative space " +
                "like the 3rd floor but there are a few individual study areas. Each floor does have one microwave and one fridge.","1/5")),
            "",
            "NHB",
            7
        ),
        StudySpot(
            R.drawable.jester,
            "Jester East Residence Hall",
            "201 E 21st St\n" +
                    "Austin, TX 78705",
            "The Red River Lounge is a study area located in Jester East, which is the smaller of Jester Center’s towering two residence halls that sits at the heart of campus’s south side, nestled between Jester West Hall and the Brackenridge, Roberts and Prather (BRP) courtyard.",
            mutableListOf( StudyRoom("Jester East Red River Lounge", "1/5", "4/5",
                "There's also a cool longhorn art located on the wall!", "No people going in and out, and no doors closing.")),
            "",
            "JES",
            8
        ),
        StudySpot(
            R.drawable.duren,
            "Duren Residence Hall (ADH)",
            "2624 Whitis Ave\n" +
                    "Austin, TX 78705",
            "The Duren Formal Lounge is a lounge bright-lit area located in Duren, which is on the northwest edge of campus and pays homage to UT Austin’s rich history while offering modern amenities. The lounge has many tables and comfortable chairs while maintaining a bright-lit room for studying. ",
            mutableListOf( StudyRoom("Duren Formal Lounge", "2/5", "4/5",
                "There's also a piano in the room for anyone who knows how to play!", "No people going in and out, and no doors closing.")),
            "",
            "ADH",
            9
        )
    )
}
