package homework.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class Genres {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;

    public Genres(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Genres() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genres{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
