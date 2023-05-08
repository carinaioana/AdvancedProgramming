package Lab5.homework;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * opens a document using the native operating system application
 */

class ViewCommand extends CatalogCommand {
    private final String documentId;

    public ViewCommand(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public void execute(Catalog catalog) throws InvalidCommandException {
        Document document = catalog.getDocumentById(documentId);
        if (document == null) {
            throw new InvalidCommandException("Document not found: " + documentId);
        }
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File(document.getPath()));
            } else {
                throw new InvalidCommandException("Desktop is not supported on this platform");
            }
        } catch (IOException e) {
            throw new InvalidCommandException("Failed to open document: " + e.getMessage());
        }
    }
}

