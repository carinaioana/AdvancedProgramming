package Lab9.homework.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "albums")
public class Albums{
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "release_year")
    private Integer release_year;

    @Column(name = "title")
    private String title;

    @Column(name = "artist")
    private String artist;

    @Column(name = "genres")

    /**
     * @ManyToOne -  owning side of the relationship.
     * @JoinColumn - the foreign key column name.
     */
   /* @ManyToOne
    @JoinColumn(name = "id")
    private Artists artistObject;*/

    private String genre;
    /**
     *  @ManyToMany - many-to-many relationship between Albums and Genres entities.
     */
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    /**
     * @JoinTable - connects the Albums and Genres entities. It defines the joinColumns attribute to specify the foreign key column for the Albums entity and
     * the inverseJoinColumns attribute to specify the foreign key column for the Genres entity.
     */
    @JoinTable(
            name = "album_genre",
            joinColumns = {@JoinColumn(name = "album_id")},
            inverseJoinColumns = {@JoinColumn(name = "genre_id")}
    )
    private Set<Genres> genres = new HashSet<>();


    public Albums(Integer id, Integer release_year, String title, String artist, String genre) {
        this.id = id;
        this.release_year = release_year;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public Albums() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "id=" + id +
                ", release_year=" + release_year +
                ", title=" + title +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
