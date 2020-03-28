package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.utils.converter.Converter;

@Component
public class MovieMapperToDto implements Converter<Movie, MovieDto> {

  @Override
  public MovieDto convert(Movie from) {
    return MovieConverter.toDto.convert(from);  }
}
