package dellbootcamp.apimusic.services;

import dellbootcamp.apimusic.interfaces.ISongModelRepo;
import dellbootcamp.apimusic.interfaces.SongsRepo;
import dellbootcamp.apimusic.modeles.SongModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SongRepository implements ISongModelRepo {
    @Autowired
    private SongsRepo songsRepo;
    public void addSong(SongModelRepo song){
        SongModelRepo s = new SongModelRepo(song.getTitle(),song.getArtist(),song.getGenre(),song.getLength(),song.getPrice());
        songsRepo.save(s);
    }


    public SongModelRepo updateSong(SongModelRepo song){
        songsRepo.save(song);
        return song;
    }


    public List<SongModelRepo> getAllSongs(){
        return songsRepo.findAll();
    }


    public List<SongModelRepo> getAllSongsOfSpecificArtist(String artist){

        return songsRepo.findAllByArtist(artist);
    }


    public SongModelRepo getSongById(String id){

        return songsRepo.getSongById(id);
    }


    public void deleteSongById(String id) {

        songsRepo.deleteSongById(id);
    }




}
