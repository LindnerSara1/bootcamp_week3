package dellbootcamp.apimusic.interfaces;

import dellbootcamp.apimusic.modeles.SongModel;
import dellbootcamp.apimusic.modeles.SongModelRepo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Repository
public interface SongsRepo extends MongoRepository<SongModelRepo, Integer> {
    List<SongModelRepo> findAllByArtist(String artist);
    SongModelRepo getSongById(String id);
    void deleteSongById(String id);
}
