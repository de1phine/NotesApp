package com.example.notesapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Query("SELECT * FROM noteentity")
    fun getAll(): List<NoteEntity>

    @Query("SELECT * FROM noteentity WHERE uid IN (:noteentetyIds)")
    fun loadAllByIds(noteentetyIds: IntArray): List<NoteEntity>

    @Query("SELECT * FROM noteentity WHERE title LIKE :title AND " + "description LIKE :description LIMIT 1")
    fun findByName(title: String, description: String): NoteEntity

    @Insert
    fun insertAll(vararg notes: NoteEntity)

    @Delete
    fun delete(note: NoteEntity)
}