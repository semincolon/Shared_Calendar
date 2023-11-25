package com.example.sharedcalendar

import java.io.Serializable

data class ScheduleData(
    val key: String = "",
    val firstTimeRegistrant: String = "",
    val firstTimeRegistrantAccount: String = "",
    val finalReviser: String = "",
    val finalReviserAccount: String = "",
    val title: String = "",
    val start_date: String = "",
    val start_time: String = "",
    val end_date: String = "",
    val end_time: String = "",
    val color: Int = 0
) : Serializable