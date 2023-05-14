package Lab8.homework.daoimpl;

import Lab8.homework.daointerfaces.GenresDAO;
import Lab8.homework.Database;
import Lab8.homework.models.Genres;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenresDAOImpl implements GenresDAO {
    @Override
    public Genres get(int id) throws SQLException {
        Connection connection = Database.getConnection();
        Genres genres = null;
        String sql = "SELECT id, name FROM genres WHERE id = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            Integer oid = resultSet.getInt("id");
            String Name = resultSet.getString("name");

            genres = new Genres(oid, Name);
        }
        Database.closeResultSet(resultSet);
        Database.closePreparedStatement(preparedStatement);
        Database.closeConnection(connection);

        return  genres;
    }

    @Override
    public List<Genres> getAll() throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "SELECT id, name FROM genres;";

        List<Genres> genresList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){

            Integer oid = resultSet.getInt("id");
            String Name = resultSet.getString("name");

            Genres genre = new Genres(oid,Name);
            genresList.add(genre);
        }
        return genresList;
    }

    @Override
    public int save(Genres genres) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Genres genres) throws SQLException {
        Connection con = Database.getConnection();

        String sql = "INSERT INTO genres (id, name) VALUES (?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, genres.getId());
        ps.setString(2, genres.getName());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(con);

        return result;    }

    @Override
    public int update(Genres genres) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "UPDATE genres set name = ? where id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, genres.getName());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;
    }

    @Override
    public int delete(Genres genres) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM genres WHERE id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, genres.getId());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;
    }
}
