package Lab5.compulsory;


import Lab5.compulsory.com.classes.Catalog;
import Lab5.compulsory.com.classes.Document;
import Lab5.compulsory.com.classes.InvalidCatalogException;
import Lab5.compulsory.com.classes.CatalogUtil;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidCatalogException {
        String path = "./catalog.json";
        Catalog catalog = new Catalog("MyDocuments");
        var book = new Document("1", "article1",path);
        book.setTitle("Vrajitorul din Oz");
        book.setAuthor("Lyman Frank Baum");
        var article = new Document("2", "book1",path);
        article.setTitle("How to make Carbonara Pasta");
        article.setAuthor("Chef Florin");
        catalog.add(book);
        catalog.add(article);
        CatalogUtil.save(catalog, path);
        catalog = CatalogUtil.load(path);
        catalog.findById("article1");
        System.out.println(catalog);
    }


}
