package nl.jordanvanbeijnhem.notepadkotlin.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import nl.jordanvanbeijnhem.notepadkotlin.database.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()
}