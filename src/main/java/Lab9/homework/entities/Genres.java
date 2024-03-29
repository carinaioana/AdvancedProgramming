package Lab9.homework.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genres")
public class Genres {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;

    /**
     * albums field is defined as a Set of Albums,
     * representing the inverse side of the many-to-many relationship
     */
    @ManyToMany(mappedBy = "genres")
    private Set<Albums> albums = new HashSet<>();

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
