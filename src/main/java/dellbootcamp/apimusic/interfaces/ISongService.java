package dellbootcamp.apimusic.interfaces;

import dellbootcamp.apimusic.modeles.SongModel;

import java.util.List;

public interface ISongService{
    void addSong(SongModel song);
    SongModel updateSong(SongModel song, int id);
    List<SongModel> getAllSongs();
    List<SongModel> getAllSongsOfSpecificArtist(String artist);
    SongModel getSongById(int id);
    void deleteSongById(int id);
}