package Lab5.homework;

import java.util.List;

class ListCommand extends CatalogCommand {
    @Override
    public void execute(Catalog catalog) throws InvalidCommandException {
        List<Document> documents = catalog.getDocuments();
        for (Document document : documents) {
            System.out.println(document);
        }
    }
}