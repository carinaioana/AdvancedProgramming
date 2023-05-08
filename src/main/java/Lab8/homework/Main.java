package Lab8.homework;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import Lab8.homework.classes.*;
import Lab8.homework.interfaces.AlbumsDAO;
import Lab8.homework.interfaces.ArtistsDAO;
import Lab8.homework.interfaces.GenresDAO;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException, FileNotFoundException {
        try {
            Connection conn = Database.getConnection();
            // use the connection object to execute queries
            //import from the real data set albumlist.csv

            CSVImporter csvImporter = new CSVImporter();
            csvImporter.ImportArtists("C:\\Users\\Carina\\Documents\\albumlist.csv");
            csvImporter.ImportAlbums("C:\\Users\\Carina\\Documents\\albumlist.csv");
            csvImporter.ImportGenres("C:\\Users\\Carina\\Documents\\albumlist.csv");

            List<Albums> albumsList;
            AlbumsDAO albumsDAO = new AlbumsDAOImpl();

            List<Artists> artistsList;
            ArtistsDAO artistsDAO = new ArtistsDAOImpl();

            List<Genres> genresList;
            GenresDAO genresDAO = new GenresDAOImpl();


            albumsList = albumsDAO.getAll();
            for (Albums album: albumsList) {
                System.out.println(album);
            }

            artistsList = artistsDAO.getAll();
            for (Artists artist: artistsList) {
                System.out.println(artist);
            }

            genresList = genresDAO.getAll();
            for (Genres genre: genresList) {
                System.out.println(genre);
            }

            conn.close(); // return the connection to the pool
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //CREATE
        /*Albums album1 = new Albums(20, 1999, "Roses", "John", "rock");
        Albums album2 = new Albums(21, 2003, "Guns", "Wick", "jazz");*/

        /*Artists artist1 = new Artists(2, "Carlas Dreams");
        Genres genre1 = new Genres(2,"pop");

        Connection conn = Database.getConnection();
        if(conn!= null){
            System.out.println("Database connection successful");
        }
        List<Albums> albumsList;
        AlbumsDAO albumsDAO = new AlbumsDAOImpl();

        List<Artists> artistsList;
        ArtistsDAO artistsDAO = new ArtistsDAOImpl();

        List<Genres> genresList;
        GenresDAO genresDAO = new GenresDAOImpl();*/

        //INSERT
        // int result1 = albumsDAO.insert(album1);
      /*  int resultArtist = artistsDAO.insert(artist1);
        int resultGenre = genresDAO.insert(genre1);*/

        //UPDATE
        //albumsDAO.update(album1);

  /*      artistsDAO.update(artist1);
        genresDAO.update(genre1);*/

        //DELETE
    /*  Albums albums20 = albumsDAO.get(20);
        albumsDAO.delete(albums20)*/;

        //System.out.println(result1);

       /* Artists artist_1 = artistsDAO.get(2);
        artistsDAO.delete(artist_1);*/

        /*Genres genre_1 = genresDAO.get(2);
        genresDAO.delete(genre_1);*/

        //READ ALL
  /*      albumsList = albumsDAO.getAll();
        for (Albums album: albumsList) {
            System.out.println(album);
        }

        artistsList = artistsDAO.getAll();
        for (Artists artist: artistsList) {
            System.out.println(artist);
        }

        genresList = genresDAO.getAll();
        for (Genres genre: genresList) {
            System.out.println(genre);
        }*/
    }
}