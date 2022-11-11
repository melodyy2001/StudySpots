package com.vima.studyspots.model

/**
 * A data class to represent one room in a study spot (building)
 */
data class StudyRoom (
    val name: String,
    val noiseLevel: String,
    val comfortability: String,
    val description: String,
    val footTraffic: String
    )