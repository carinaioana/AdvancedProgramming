package Lab5.compulsory.com.classes;

import java.io.File;
import java.io.IOException;
import Lab5.compulsory.com.classes.Catalog;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  save and load Catalog objects to and from JSON files
 *  using the Jackson library
 */
public class CatalogUtil {
    public CatalogUtil() { }

    /**
     * serialize the Catalog object into JSON format and write it to a file specified by the path
     * @param catalog
     * @param path
     * @throws IOException
     */
    public static void save(Catalog catalog, String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), catalog);
    }

    /**
     * I catch the IOException and rethrow it
     * as a new InvalidCatalogException with the path of the invalid catalog as a parameter
     */

    /**
     * deserialize a Catalog object from the JSON file specified by the path.
     * It uses the ObjectMapper class to read the JSON file and map it to a Catalog object.
     * @param path
     * @return
     * @throws InvalidCatalogException
     */
    public static Catalog load(String path) throws InvalidCatalogException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Catalog catalog = objectMapper.readValue(new File(path), Catalog.class);
            return catalog;
        } catch (IOException e){
            throw new InvalidCatalogException(path);
        }

    }
}
