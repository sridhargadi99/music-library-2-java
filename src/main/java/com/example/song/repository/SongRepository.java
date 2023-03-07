// Write your code here
package com.example.song.repository;

import com.example.song.model.Song;
import java.util.*;

public interface SongRepository{
    ArrayList<Song> getAllSongs();
    Song addNewSong(Song song);
    Song getSong(int songId);
    Song updateSongDetails(int songId, Song song);
    
    void deleteSong(int songId);
}