package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieListMapper {

    public List<MovieDto> dto(List<Movie> from) {
        return from.stream()
            .map(movie -> MovieConverter.toDto.convert(movie))
            .collect(Collectors.toList());
    }

    public List<Movie> fromDto(List<MovieDto> from) {
        return from.stream()
            .map(movie -> MovieConverter.fromDto.convert(movie))
            .collect(Collectors.toList());
    }
}
