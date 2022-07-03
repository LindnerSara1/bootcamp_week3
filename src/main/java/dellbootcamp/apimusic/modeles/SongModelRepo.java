package dellbootcamp.apimusic.modeles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "songs")
public class SongModelRepo {

        static int count = 0;
        @Id
        private String id;
        private String title;
        private String artist;
        private GenreEnum genre;
        private int length;
        private float price;

        public SongModelRepo(String title, String artist, GenreEnum genre, int length, float price) {
            this.id = String.valueOf(count++);
            this.title = title;
            this.artist = artist;
            this.genre = genre;
            this.length = length;
            this.price = price;
        }

    }
