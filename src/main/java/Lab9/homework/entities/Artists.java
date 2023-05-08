package Lab9.homework.entities;
//one to many

import Lab5.compulsory.com.classes.Catalog;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "artists")
public class Artists {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;


    public Artists(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @OneToMany -a one-to-many relationship between entities.
     *  there can be multiple Albums associated with the entity Artist
     *
     */
    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
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

    public Set<Albums> getAlbums() {
        return albums;
    }
}
