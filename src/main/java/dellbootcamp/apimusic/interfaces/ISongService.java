package dellbootcamp.apimusic.interfaces;

import dellbootcamp.apimusic.modeles.SongModel;

import java.util.List;

public interface ISongService{
    void addSong(SongModel song);
    SongModel updateSong(SongModel song);
    List<SongModel> getAllSongs();
    List<SongModel> getAllSongsOfSpecificArtist(String artist);
    SongModel getSongById(Integer id);
    void deleteSongById(Integer id);
}