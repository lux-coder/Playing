package com.example.playing.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class NoteInjector(application: Application): AndroidViewModel(application) {

    private fun getNoteRepository(): INoteRepository{
        return NoteRepoImpl(
            local = RoomNoteDatabase.getInstance(getApplication()).roomNoteDao()
        )
    }
}