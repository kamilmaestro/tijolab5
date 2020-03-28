package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.utils.converter.Converter;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieListMapperFromDto implements Converter<List<MovieDto>, List<Movie>> {

  @Override
  public List<Movie> convert(List<MovieDto> from) {
    return from.stream()
        .map(movie -> MovieConverter.fromDto.convert(movie))
        .collect(Collectors.toList());
  }
}
