package com.vima.studyspots.model

import androidx.annotation.DrawableRes

/**
 * A data class to represent the information presented in the study spot card
 */
data class StudySpot (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val location: String,
    val description: String,
    val studyRooms: MutableList<StudyRoom>,
    val bookURL: String
)