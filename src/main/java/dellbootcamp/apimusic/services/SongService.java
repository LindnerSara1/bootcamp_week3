package dellbootcamp.apimusic.services;

import java.util.*;

import dellbootcamp.apimusic.interfaces.ISongService;
import dellbootcamp.apimusic.interfaces.SongsRepo;
import dellbootcamp.apimusic.modeles.SongModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import static dellbootcamp.apimusic.modeles.Songs.songs;

@Service
public class SongService implements ISongService {

    public void addSong(SongModel song){
        SongModel s = new SongModel(song.getTitle(),song.getArtist(),song.getGenre(),song.getLength(),song.getPrice());
        songs.add(s);
    }
    public SongModel updateSong(SongModel song){
//        return Arrays.stream(songs).findFirst().map(s->s.getId()==song.getId()?{
//
//        })

        songs.set(song.getId(), song);
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
    public SongModel getSongById(Integer id){
        for( SongModel s: songs){
            if(s.getId().equals(id))
                return s;
        }
        return null;
    }
    public void deleteSongById(Integer id) {
        for (SongModel s : songs) {
            if (s.getId().equals(id)) {
                songs.remove(s);
                System.out.println("remove song in service");
            }
        }
    }
}