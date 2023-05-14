package Lab8.homework.daoimpl;

import Lab8.homework.daointerfaces.ArtistsDAO;
import Lab8.homework.models.Artists;
import Lab8.homework.Database;
import com.opencsv.exceptions.CsvValidationException;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistsDAOImpl implements ArtistsDAO {
    @Override
    public Artists get(int id) throws SQLException {
        Connection connection = Database.getConnection();
        Artists artists = null;
        String sql = "SELECT id, name FROM artists WHERE id = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            Integer oid = resultSet.getInt("id");
            String Name = resultSet.getString("name");

            artists = new Artists(oid, Name);
        }
        Database.closeResultSet(resultSet);
        Database.closePreparedStatement(preparedStatement);
        Database.closeConnection(connection);

        return  artists;
    }

    @Override
    public List<Artists> getAll() throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "SELECT id, name FROM artists;";

        List<Artists> artistsList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){

            Integer oid = resultSet.getInt("id");
            String Name = resultSet.getString("name");

            Artists artist = new Artists(oid,Name);
            artistsList.add(artist);
        }
        return artistsList;
    }

    @Override
    public int save(Artists artists) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Artists artists) throws SQLException, IOException, CsvValidationException {
        Connection con = Database.getConnection();

        String sql = "INSERT INTO artists (id, name) VALUES (?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, artists.getId());
        ps.setString(2, artists.getName());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(con);

        return result;
    }

    @Override
    public int update(Artists artists) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "UPDATE artists set name = ? where id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, artists.getName());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;
    }

    @Override
    public int delete(Artists artists) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM artists WHERE id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, artists.getId());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;
    }

}
