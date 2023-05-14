package Lab8.compulsory;

import java.sql.*;

/**
 * This class provides a singleton instance for managing a database connection.
 */
public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/"; // The URL of the database
    private static final String USER = "postgres"; // The username for the database
    private static final String PASSWORD = "password"; // The password for the database
    private static Connection connection = null; // The database connection instance

    private Database() {
        // Private constructor to prevent instantiation from outside the class
    }

    /**
     * Retrieves a connection to the database.
     */
    public static Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }

    /**
     * Closes the given database connection.
     */
    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    /**
     * Closes the given database statement(execute SQL queries or updates against a database)
     */
    public static void closeStatement(Statement statement) throws SQLException {
        statement.close();
    }

    /**
     * Closes the given prepared statement(pre-compiled SQL statement that is stored in a database)
     */
    public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    /**
     * Closes the given result set(represents the data retrieved from a database query.)
      */
    public static void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }
}
