package Lab5.compulsory.com.classes;

/**
 * created a custom InvalidCatalogException that extends the Exception class
 */
public class InvalidCatalogException extends Exception {
    private String catalogPath;

    /**
     * @param catalogPath - takes the path of the invalid catalog
     * & passes a formatted error message to the superclass constructor
     * using the super() keyword.
     */
    public InvalidCatalogException(String catalogPath){
        super("Invalid catalog found at " + catalogPath);
        this.catalogPath = catalogPath;

    }
    public String getCatalogPath(){
        return catalogPath;
    }
}
