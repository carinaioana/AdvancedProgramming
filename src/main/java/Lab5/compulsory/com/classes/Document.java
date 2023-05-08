package Lab5.compulsory.com.classes;

import Lab5.compulsory.Main;

import java.io.Serializable;
import java.util.*;

public class Document implements Serializable {
    private String id;
    private String title;
    private String author;

    private String location;//file name or Web page
    private String name;
    private Map<String, Object> tags = new HashMap<>();

    /**
     * ctors
     */
    public Document() {
    }
    public Document(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.location = location;

    }
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
    /**
     * setters and getters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getTags() {
        return tags;
    }

    public void setTags(Map<String, Object> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", tags=" + tags +
                '}';
    }
}
