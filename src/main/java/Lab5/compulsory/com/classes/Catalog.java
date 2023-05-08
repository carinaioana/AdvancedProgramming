package Lab5.compulsory.com.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String name;
    private List<Document> docs = new ArrayList<>();

    public Catalog() {
    }

    /**
     * ctor
     */

    public Catalog(String name) {
        this.name = name;
    }

    public Catalog(String name, List<Document> docs) {
        this.name = name;
        this.docs = docs;
    }

    /**
     *
     * setters and getters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Document> getDocs() {
        return docs;
    }

    public void setDocs(List<Document> docs) {
        this.docs = docs;
    }


    public Document findById(String id) {
        for (Document doc : docs) {
            if (doc.getId().equals(id)) {
                return doc;
            }
        }
        return null;
    }
    /**
     * adds a new entry to the catalog
     */
    public void add(Document doc) {
        docs.add(doc);
    }
    /**
     * a textual representation of the catalog
     */
    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", docs=" + docs +
                '}';
    }
}
