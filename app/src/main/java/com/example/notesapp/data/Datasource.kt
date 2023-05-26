package com.example.notesapp.data

import com.example.notesapp.R
import com.example.notesapp.model.Note

class Datasource {
    fun loadNotes(): List<Note> {
        return listOf<Note>(
            Note("Avocados are a fruit, not a vegetable"),
            Note("Ketchup was once sold as medicine"),
            Note("The Easter Island heads have bodies"),
            Note("Call parents"),
            Note("Go for a walk")
        )
    }
}