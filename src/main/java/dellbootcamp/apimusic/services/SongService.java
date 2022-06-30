package dellbootcamp.apimusic.services;

import java.util.*;

import dellbootcamp.apimusic.interfaces.ISongService;
import dellbootcamp.apimusic.modeles.SongModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import static dellbootcamp.apimusic.modeles.Songs.songs;

@Service
public class SongService implements ISongService {

    @PostMapping("/add")
    public void addSong(SongModel song){
        SongModel s = new SongModel(song.getTitle(),song.getArtist(),song.getGenre(),song.getLength(),song.getPrice());
        songs.add(s);
    }
    public SongModel updateSong(SongModel song,int index){
//        return Arrays.stream(songs).findFirst().map(s->s.getId()==song.getId()?{
//
//        })

        songs.set(index, song);
//        for (SongModel i : songs) {
//            if(i.getId() == song.getId()){
//                i.setTitle(song.getTitle());
//                i.setArtist(song.getArtist());
//                i.setGenre(song.getGenre());
//                i.setLength(song.getLength());
//                i.setPrice(song.getPrice());
//                return i;
//            }
//        }return null;
        return song;
    }
    public List<SongModel> getAllSongs(){

        return songs;
    }
    public List<SongModel> getAllSongsOfSpecificArtist(String artist){
        List<SongModel> songArtist = new ArrayList<>();
        songArtist = songs.stream().filter(s-> s.getArtist().equals(artist)).toList();
//        for(SongModel a : songs){
//            //
//            //implement equals in class Song
//            if(a.getArtist().equals(artist)){
//                songArtist.add(a);
//            }
//        }

        return songArtist;
    }
    public SongModel getSongById(int id){
        for( SongModel s: songs){
            if(s.getId() == id)
                return s;
        }
        return null;
    }
    public void deleteSongById(int id) {
        for (SongModel s : songs) {
            if (s.getId() == id) {
                songs.remove(s);
            }
        }
    }
}