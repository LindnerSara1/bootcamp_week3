package dellbootcamp.apimusic.interfaces;

import dellbootcamp.apimusic.modeles.SongModel;
import dellbootcamp.apimusic.modeles.SongModelRepo;

import java.util.List;
import java.util.Optional;

public interface ISongRepository {
    void addSong(SongModelRepo song);
    SongModelRepo updateSong(SongModelRepo song);
    List<SongModelRepo> getAllSongs();
    List<SongModelRepo> getAllSongsOfSpecificArtist(String artist);
    Optional<SongModelRepo> getSongById(String id);
    void deleteSongById(String id);
}
