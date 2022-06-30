package dellbootcamp.apimusic.modeles;

import java.util.*;

import dellbootcamp.apimusic.interfaces.ISongModel;
import dellbootcamp.apimusic.modeles.GenreEnum;
import dellbootcamp.apimusic.modeles.SongModel;

public class Songs{
//    public static SongModel songs[] = {
//        new SongModel("Yama","Benni Fridman", GenreEnum.CLASSICAL,15,14),
//                new SongModel("shuvi","Naftali Kempe", GenreEnum.CLASSICAL,15,14),
//                new SongModel("Jerusalem","Naftali Kempe", GenreEnum.POP,23,58),
//                new SongModel("Yama","Benni Fridman", GenreEnum.ROCK,10,17),
//                new SongModel("Yama","Benni Fridman", GenreEnum.RAP,74,85) ,
//    new SongModel(),new SongModel(),new SongModel(),new SongModel()};
//    public static int iArr = 5;
    public static List<SongModel> songs = new ArrayList<>();
    public static void main(String args[]){
        SongModel s = new SongModel("Yama","Benni Fridman", GenreEnum.CLASSICAL,15,14);
        SongModel s2 = new SongModel("Jerusalem","Naftali Kempe", GenreEnum.POP,23,58);
        songs.add(s);
        songs.add(s2);
    }

}