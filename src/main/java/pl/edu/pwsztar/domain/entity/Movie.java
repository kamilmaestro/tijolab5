package pl.edu.pwsztar.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movies")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "year")
    private Integer year;

    public Movie() {
    }

    public Movie(String title, String image, Integer year) {
        this.title = title;
        this.image = image;
        this.year = year;
    }

    public Movie(Long movieId, String title, String image, Integer year) {
        this.movieId = movieId;
        this.title = title;
        this.image = image;
        this.year = year;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }
}
