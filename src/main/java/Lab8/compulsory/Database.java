package Lab8.compulsory;

import javax.print.DocFlavor;
import java.sql.*;

public class Database {
    private static final String URL =
            "jdbc:postgresql://localhost:5432/";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";
    private static Connection connection = null;
    private Database(){}
    public static Connection getConnection() throws SQLException{
        connection = DriverManager.getConnection(URL,USER, PASSWORD);
        return connection;
    }
    public static void closeConnection(Connection connection) throws SQLException{
        connection.close();
    }
    public static void closeStatement(Statement statement) throws SQLException{
        statement.close();
    }
    public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException{
        preparedStatement.close();
    }
    public static void closeResultSet(ResultSet resultSet) throws SQLException{
        resultSet.close();
    }
}