package Lab9.homework;


import Lab8.compulsory.Albums;
import Lab9.homework.abstractImpl.AlbumRepositoryImpl;
import Lab9.homework.abstractRepository.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        AlbumsRepository albumsRepository = new AlbumRepositoryImpl();

        Albums album1 = albumsRepository.getById(1);
        System.out.println(album1);

   /*     Albums album = new Albums();
        album.setTitle("Abbey Road");
        album.setArtist("The Beatles");
        album.setRelease_year(1969);
        album.setGenre("Rock");

        // save the album to the database
        albumsRepository.save(album);*/
    }
}
