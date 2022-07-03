package dellbootcamp.apimusic.interfaces;

import dellbootcamp.apimusic.modeles.GenreEnum;

public interface ISongModelRepo {
    String id = null;
    String title = "";
    String artist = "";
    GenreEnum genre = GenreEnum.RAP;
    int length = 0;
    float price = 0;
}
