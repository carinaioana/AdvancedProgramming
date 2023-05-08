package Lab9.homework.entities;
//one to many

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Artists {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;


    public Artists(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    @OneToMany(targetEntity = Albums.class)
    private Set<Albums> albums = new HashSet<>();

    public Artists() {

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
        return "Artists{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
