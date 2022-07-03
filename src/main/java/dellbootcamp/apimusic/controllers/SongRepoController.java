package dellbootcamp.apimusic.controllers;

import dellbootcamp.apimusic.modeles.SongModel;
import dellbootcamp.apimusic.modeles.SongModelRepo;
import dellbootcamp.apimusic.services.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Songs")
public class SongRepoController {

    @Autowired
    private SongRepository repository;
//    @Autowired
//    public SongRepoController(SongRepository songRepository){
//        this.repository = songRepository;
//    }


    @PostMapping(value = "/add")
    public void addSong(@RequestBody SongModelRepo song) {
        repository.addSong(song);
    }


    //    @PutMapping("/update")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public SongModelRepo updateSong(@RequestBody SongModelRepo song){
        SongModelRepo s = repository.updateSong(song);
        return s;
    }

    @GetMapping("/{id}")
    public SongModelRepo getSongById(@PathVariable String id){
        SongModelRepo s = repository.getSongById(id);
        return s;
    }

    @GetMapping()
    public List<SongModelRepo> getAllSongs(){
        List<SongModelRepo> s = new ArrayList<>();
        return s = repository.getAllSongs();
//        if(s!=null){
//            return ResponseEntity.badRequest().body(null);
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(s);
    }

    @GetMapping("/artist/{artist}")
    public List<SongModelRepo> getAllSongsOfSpecificArtist(@PathVariable String artist){
        List<SongModelRepo> s =repository.getAllSongsOfSpecificArtist(artist);
//        if(s!=null){
//            return ResponseEntity.status(HttpStatus.OK).body(null);
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(s);
        return s;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSongById(@PathVariable String id) {
        repository.deleteSongById(id);
        System.out.println("remove song in controller");
    }
}