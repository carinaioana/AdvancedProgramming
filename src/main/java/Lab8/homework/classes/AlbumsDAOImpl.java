package Lab8.homework.classes;

import Lab8.homework.interfaces.AlbumsDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlbumsDAOImpl implements AlbumsDAO {

    //CRUD - Retrieve
    @Override
    public Albums get(int id) throws SQLException {
        Connection connection = Database.getConnection();
        Albums albums = null;
        String sql = "SELECT id, release_year, title, artist, genre FROM albums WHERE id = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            Integer oid = resultSet.getInt("id");
            Integer ReleaseYear = resultSet.getInt("release_year");
            String Title = resultSet.getString("title");
            String Artist = resultSet.getString("artist");
            String Genre = resultSet.getString("genre");

            albums = new Albums(oid, ReleaseYear, Title, Artist, Genre);
        }
        Database.closeResultSet(resultSet);
        Database.closePreparedStatement(preparedStatement);
        Database.closeConnection(connection);

        return  albums;
    }
    //CRUD - Retrieve All
    @Override
    public List<Albums> getAll() throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "SELECT id, release_year, title, artist, genres FROM albums;";

        List<Albums> albumList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){

            Integer oid = resultSet.getInt("id");
            Integer ReleaseYear = resultSet.getInt("release_year");
            String Title = resultSet.getString("title");
            String Artist = resultSet.getString("artist");
            String Genre = resultSet.getString("genres");

            Albums album = new Albums(oid, ReleaseYear, Title, Artist, Genre);
            albumList.add(album);
        }
        return albumList;
    }
    //CRUD - Create or Update
    @Override
    public int save(Albums albums) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Albums albums) throws SQLException {
        Connection con = Database.getConnection();

        String sql = "INSERT INTO albums (id, release_year, title, artist, genre) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, albums.getId());
        ps.setInt(2, albums.getRelease_year());
        ps.setString(3, albums.getTitle());
        ps.setString(4, albums.getArtist());
        ps.setString(5, albums.getGenre());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(con);

        return result;
    }

    @Override
    public int update(Albums albums) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "UPDATE albums set release_year = ?, title = ?, artist = ?, genre = ? where id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, albums.getRelease_year());
        ps.setString(2, albums.getTitle());
        ps.setString(3, albums.getArtist());
        ps.setString(4, albums.getGenre());
        ps.setInt(5, albums.getId());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;
    }
    //CRUD - Delete
    @Override
    public int delete(Albums albums) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM albums WHERE id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, albums.getId());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;
    }
}
