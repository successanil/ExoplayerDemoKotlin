package com.dbtechprojects.exoplayerdemokotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.dbtechprojects.exoplayerdemokotlin.models.Song
import com.dbtechprojects.exoplayerdemokotlin.repository.SongRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SongViewModel
@Inject constructor(val songRepository: SongRepository) : ViewModel() {

    fun getSongsUrls(): ArrayList<Song> {
        return songRepository.getSongsUrls()
    }
}