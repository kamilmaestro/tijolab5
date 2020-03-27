package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieMapper {

    public Movie createMovie(CreateMovieDto from) {
        return MovieConverter.fromCreateMovieDto.convert(from);
    }

    public MovieDto dto(Movie from) {
        return MovieConverter.toDto.convert(from);
    }
}
