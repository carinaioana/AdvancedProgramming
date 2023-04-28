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
    public void CSVImport(String file) throws SQLException, IOException, CsvValidationException {
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
}
