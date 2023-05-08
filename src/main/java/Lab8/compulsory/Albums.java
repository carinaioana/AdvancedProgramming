package Lab8.compulsory;

public class Albums {
    private Integer id;
    private Integer release_year;
    private String title;
    private String artist;
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
