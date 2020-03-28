package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.utils.converter.Converter;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieListMapperToDto implements Converter<List<Movie>, List<MovieDto>> {

    @Override
    public List<MovieDto> convert(List<Movie> from) {
        return from.stream()
            .map(movie -> MovieConverter.toDto.convert(movie))
            .collect(Collectors.toList());
    }
}
