package com.example.sharedcalendar

import java.util.Calendar

class CalendarUtil {
    companion object {
        var selectedDate: Calendar = Calendar.getInstance()
        val today = Calendar.getInstance()
    }
}