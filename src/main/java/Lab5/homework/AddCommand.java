package Lab5.homework;


import java.util.Map;

/**
 * adds a new document to the catalog
 */
class AddCommand extends CatalogCommand {
    private final String id;
    private final String name;
    private final String path;
    private final Map<String, String> tags;

    public AddCommand(String id, String name, String path, Map<String, String> tags) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.tags = tags;
    }

    @Override
    public void execute(Catalog catalog) throws InvalidCommandException {
        try {
            catalog.addDocument(new Document(id, name, path, tags));
        } catch (IllegalArgumentException e) {
            throw new InvalidCommandException("Invalid document data: " + e.getMessage());
        }
    }
}