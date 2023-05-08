package Lab9.homework;


import Lab8.compulsory.Albums;
import Lab9.homework.abstractRepository.AlbumsRepository;

public class Main {
    public static void main(String[] args) {
        AlbumsRepository albumsRepository = new AlbumRepositoryImpl();
     Albums album = new Albums();
        album.setTitle("Abbey Road");
        album.setArtist("The Beatles");
        album.setRelease_year(1969);
        album.setGenre("Rock");

        // save the album to the database
        albumsRepository.save(album);
    }
}
