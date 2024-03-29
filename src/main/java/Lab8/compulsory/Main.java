package Lab8.compulsory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
       /* Albums album1 = new Albums(20, 1999, "Roses", "John", "rock");
        Albums album2 = new Albums(21, 2003, "Guns", "Wick", "jazz");
*/
        //System.out.println(album1);
        Connection conn = Database.getConnection();
        if(conn!= null){
            System.out.println("Database connection successful");
        }
        List<Albums> albumsList;
        AlbumsDAO albumsDAO = new AlbumsDAOImpl();

        //DELETE
     /*   int result1 = albumsDAO.insert(album1);

        //UPDATE
        albumsDAO.update(album1);*/

        //DELETE
    /*    Albums albums20 = albumsDAO.get(20);
        albumsDAO.delete(albums20)*/;

        //System.out.println(result1);

        //READ
        albumsList = albumsDAO.getAll();
        for (Albums album: albumsList) {
            System.out.println(album);
        }
    }
}