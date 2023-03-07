/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
package com.example.song.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.song.service.SongH2Service;
import com.example.song.model.Song;
import java.util.*;

@RestController
public class SongController{
    @Autowired
    public SongH2Service songService;

    @GetMapping("/songs")
    public ArrayList<Song> getAllSongs(){
        return songService.getAllSongs();
    }

    @PostMapping("/songs")
    public Song addNewSong(@RequestBody Song song){
        return songService.addNewSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getSong(@PathVariable ("songId") int songId){
        return songService.getSong(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSongDetails(@PathVariable ("songId") int songId, @RequestBody Song song){
        return songService.updateSongDetails(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        songService.deleteSong(songId);
    }
    
}
