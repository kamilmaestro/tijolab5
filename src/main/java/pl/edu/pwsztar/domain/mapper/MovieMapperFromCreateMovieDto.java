package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.utils.converter.Converter;

@Component
public class MovieMapperFromCreateMovieDto implements Converter<CreateMovieDto, Movie> {

    @Override
    public Movie convert(CreateMovieDto from) {
        return MovieConverter.fromCreateMovieDto.convert(from);
    }
}
