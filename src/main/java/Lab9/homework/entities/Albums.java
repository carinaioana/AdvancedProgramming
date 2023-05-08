package Lab9.homework.entities;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Album.findAll",
                query = "select e from Albums e order by e.title"),
        @NamedQuery(name = "Album.findByArtist",
                query = "select e from Albums e where e.artist = ?1"),
        @NamedQuery(name = "Albums.findByTitle",
                query = "select a from Albums a where a.title = :title")
})
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
    private String genre;

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
