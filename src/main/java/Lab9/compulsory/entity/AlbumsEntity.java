package Lab9.compulsory.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * An entity represents a table stored in a database
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Album_findAll",
                query = "select e from AlbumsEntity e order by e.title"),
        @NamedQuery(name = "Album_findByArtist",
                query = "select e from AlbumsEntity e where e.artist = ?1"),
        @NamedQuery(name = "Albums_findByTitle",
                query = "select a from AlbumsEntity a where a.title = :title")
})
@Table(name = "albums", schema = "public", catalog = "postgres")
public class AlbumsEntity {
    @Id
    @Basic
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "release_year")
    private Integer releaseYear;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "artist")
    private String artist;
    @Basic
    @Column(name = "genres")
    private String genres;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
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

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumsEntity that = (AlbumsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(releaseYear, that.releaseYear) && Objects.equals(title, that.title) && Objects.equals(artist, that.artist) && Objects.equals(genres, that.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, releaseYear, title, artist, genres);
    }

    @Override
    public String toString() {
        return "AlbumsEntity{" +
                "id=" + id +
                ", releaseYear=" + releaseYear +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genres='" + genres + '\'' +
                '}';
    }
}
