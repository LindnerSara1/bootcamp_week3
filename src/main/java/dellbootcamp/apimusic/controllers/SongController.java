package dellbootcamp.apimusic.controllers;

import dellbootcamp.apimusic.interfaces.ISongService;
import dellbootcamp.apimusic.interfaces.SongsRepo;
import dellbootcamp.apimusic.modeles.SongModel;
import dellbootcamp.apimusic.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.*;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

/*
@RestController
@RequestMapping("Songs")
public class SongController {

    @Autowired
    private ISongService ISongService;
    @Autowired
    private SongsRepo songRepo;


    @PostMapping(value = "/add")
    public void addSong(@RequestBody SongModel song) {
        ISongService.addSong(song);
    }
//    public String addSong(@RequestBody SongModel song){
//        songRepo.save(song);
//    }


//    @PutMapping("/update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public SongModel updateSong(@RequestBody SongModel song){
        SongModel s = ISongService.updateSong(song);
        return s;
    }

    @GetMapping("/{id}")
    public SongModel getSongById(@PathVariable Integer id){
        SongModel s = ISongService.getSongById(id);
        return s;
    }

    @GetMapping()
    public List<SongModel> getAllSongs(){
        List<SongModel> s = new ArrayList<>();
        return s = ISongService.getAllSongs();
//        if(s!=null){
//            return ResponseEntity.badRequest().body(null);
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(s);
    }

    @GetMapping("/artist/{artist}")
    public List<SongModel> getAllSongsOfSpecificArtist(@PathVariable String artist){
        List<SongModel> s =ISongService.getAllSongsOfSpecificArtist(artist);
//        if(s!=null){
//            return ResponseEntity.status(HttpStatus.OK).body(null);
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(s);
        return s;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSongById(@PathVariable Integer id) {
        ISongService.deleteSongById(id);
        System.out.println("remove song in controller");
    }


}*/