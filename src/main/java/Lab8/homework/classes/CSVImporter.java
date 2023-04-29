package Lab8.homework.classes;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CSVImporter {
    /**
     * returns the database artists imported from the real data set
     * @param file
     * @throws SQLException
     * @throws IOException
     * @throws CsvValidationException
     */
    public void ImportArtists(String file) throws SQLException, IOException, CsvValidationException {
        Connection connection = Database.getConnection();
        CSVReader reader = null;

        String sql = "INSERT INTO artists (id, name) VALUES (?, ?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        reader = new CSVReader(new FileReader(file));
        String[] line;
        while ((line = reader.readNext()) != null) {
            // extract the data from the CSV row
            int col1 = Integer.parseInt(line[0]);
            String col2 = line[3];

            // set the parameters of the prepared statement
            ps.setInt(1, col1);
            ps.setString(2, col2);

            // execute the SQL statement
            ps.executeUpdate();
        }
    }

    /**
     * returns the database albums imported from the real data set
     * @param file
     * @throws SQLException
     * @throws IOException
     * @throws CsvValidationException
     */
    public void ImportAlbums(String file) throws SQLException, IOException, CsvValidationException {
        Connection connection = Database.getConnection();
        CSVReader reader = null;

        String sql = "INSERT INTO albums (id, release_year, title, artist, genres) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        reader = new CSVReader(new FileReader(file));
        String[] line;
        while ((line = reader.readNext()) != null) {
            // extract the data from the CSV row
            int col1 = Integer.parseInt(line[0]);
            int col2 = Integer.parseInt(line[1]);
            String col3 = line[3];
            String col4 = line[4];
            String col5 = line[5];

            // set the parameters of the prepared statement
            ps.setInt(1, col1);
            ps.setInt(2, col2);
            ps.setString(3,col3);
            ps.setString(4,col4);
            ps.setString(5, col5);

            // execute the SQL statement
            ps.executeUpdate();
        }
    }

    /**
     * returns the database genres imported from the real data set
     * @param file
     * @throws SQLException
     * @throws IOException
     * @throws CsvValidationException
     */
    public void ImportGenres(String file) throws SQLException, IOException, CsvValidationException {
        Connection connection = Database.getConnection();
        CSVReader reader = null;

        String sql = "INSERT INTO genres (id, name) VALUES (?, ?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        reader = new CSVReader(new FileReader(file));
        String[] line;
        while ((line = reader.readNext()) != null) {
            // extract the data from the CSV row
            int col1 = Integer.parseInt(line[0]);
            String col2 = line[5];

            // set the parameters of the prepared statement
            ps.setInt(1, col1);
            ps.setString(2, col2);

            // execute the SQL statement
            ps.executeUpdate();
        }
    }
}
