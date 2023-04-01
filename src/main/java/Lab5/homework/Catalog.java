package Lab5.homework;

import java.util.ArrayList;
import java.util.List;

class Catalog {
    private final List<Document> documents = new ArrayList<>();
    public void addDocument(Document document) {
        documents.add(document);
    }

    public List<Document> getDocuments() {
        return new ArrayList<>(documents);
    }

    public Document getDocumentById(String id) {
        for (Document document : documents) {
            if (document.getId().equals(id)) {
                return document;
            }
        }
        return null;
    }
}