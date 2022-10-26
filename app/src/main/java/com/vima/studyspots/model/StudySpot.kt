package com.vima.studyspots.model

/**
 * A data class to represent the information presented in the study spot card
 */
data class StudySpot (
    val name: String,
    val location: String,
    val noiseLevel: Int
    )