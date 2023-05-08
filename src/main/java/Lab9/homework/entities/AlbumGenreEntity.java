package Lab9.homework.entities;

import javax.persistence.*;

@Entity
@Table(name = "album_genre")
public class AlbumGenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Albums album;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genres genre;

    public AlbumGenreEntity() {
    }

    public AlbumGenreEntity(Integer id, Albums album, Genres genre) {
        this.id = id;
        this.album = album;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Albums getAlbum() {
        return album;
    }

    public void setAlbum(Albums album) {
        this.album = album;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }
}
