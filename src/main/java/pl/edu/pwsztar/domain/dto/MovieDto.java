package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class MovieDto implements Serializable {
    private Long movieId;
    private String title;
    private String image;
    private Integer year;

    public MovieDto(Long movieId, String title, String image, Integer year) {
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
