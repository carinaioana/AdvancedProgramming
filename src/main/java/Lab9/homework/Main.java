package Lab9.homework;

import Lab9.homework.absRepoImpl.AlbumRepoImpl;
import Lab9.homework.abstractRepository.AlbumsRepository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        AlbumsRepository albumsRepository = new AlbumRepoImpl();
   /*         Albums album = new Albums();
            album.setId(1);
            album.setTitle("Abbey Road");
            album.setArtist("The Beatles");
            album.setRelease_year(1969);
            album.setGenre("Rock");


        // save the album to the database
            albumsRepository.save(album);*/

        ImportData importData = new ImportData();
        importData.addData();

    }
}
