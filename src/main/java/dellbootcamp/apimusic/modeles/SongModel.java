package dellbootcamp.apimusic.modeles;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "songs")
public class SongModel {
    
    static int count = 0;
    @Id
    private  int id;
    private String title;
    private String artist;
    private GenreEnum genre;
    private int length;
    private float price;

    public SongModel(String title, String artist, GenreEnum genre, int length, float price) {
        this.id = count++;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.length = length;
        this.price = price;
    }

    // public int getId() {
    //     return this.id;
    // }

    // public String getTitle() {
    //     return this.title;
    // }

    // public String getArtist() {
    //     return this.artist;
    // }

    // public GenreEnum getGenre() {
    //     return this.genre;
    // }

    // public int getLength() {
    //     return this.length;
    // }

    // public float getPrice() {
    //     return this.price;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public void setArtist(String artist) {
    //     this.artist = artist;
    // }

    // public void setGenre(GenreEnum genre) {
    //     this.genre = genre;
    // }

    // public void setLength(int length) {
    //     this.length = length;
    // }

    // public void setPrice(float price) {
    //     this.price = price;
    // }
}