package dellbootcamp.apimusic.interfaces;

import dellbootcamp.apimusic.modeles.SongModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongsRepo extends MongoRepository<SongModel, Integer> {
}
