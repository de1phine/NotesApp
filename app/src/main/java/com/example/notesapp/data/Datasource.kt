package com.example.notesapp.data

import com.example.notesapp.R
import com.example.notesapp.model.Note

class Datasource {
    fun loadNotes(): List<Note> {
        return listOf<Note>(
        Note(R.string.note1),
        Note(R.string.note2),
        Note(R.string.note3),
        Note(R.string.note4),
        Note(R.string.note5)
        )
    }
}