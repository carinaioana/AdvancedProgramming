package Lab5.compulsory.com.classes;

import java.io.File;
import java.io.IOException;
import Lab5.compulsory.com.classes.Catalog;

import com.fasterxml.jackson.databind.ObjectMapper;
public class CatalogUtil {
    public CatalogUtil() { }

    public static void save(Catalog catalog, String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), catalog);
    }

    /**
     * I catch the IOException and rethrow it
     * as a new InvalidCatalogException with the path of the invalid catalog as a parameter
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
