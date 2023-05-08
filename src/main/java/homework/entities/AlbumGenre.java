package homework.entities;

import Lab9.homework.entities.Albums;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//many to many
@Entity
public class AlbumGenre {
    @Id
    private Integer id;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "album_genre",
            joinColumns = {@JoinColumn(name = "album_id")},
            inverseJoinColumns = {@JoinColumn(name ="genre_id")},
            uniqueConstraints = {@UniqueConstraint(columnNames = {"album_id","genre_id"}
            )
            }
    )

    private Set<Albums>albums = new HashSet<>();

    public AlbumGenre(Integer id, Set<Albums> albums) {
        this.id = id;
        this.albums = albums;
    }

    public AlbumGenre() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AlbumGenre{" +
                "id=" + id +
                ", albums=" + albums +
                '}';
    }
}
