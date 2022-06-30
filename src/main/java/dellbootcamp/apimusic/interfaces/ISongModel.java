package dellbootcamp.apimusic.interfaces;

import dellbootcamp.apimusic.modeles.GenreEnum;
import lombok.*;

import javax.persistence.Entity;


public interface ISongModel {
    Integer id = null;
    String title = "";
    String artist = "";
    GenreEnum genre = GenreEnum.RAP;
    int length = 0;
    float price = 0;
}
