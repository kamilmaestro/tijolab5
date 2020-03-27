package pl.edu.pwsztar.domain.mapper;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.utils.converter.Converter;

class MovieConverter {

  static Converter<Movie, MovieDto> toDto = (movie) ->
      new MovieDto(movie.getMovieId(), movie.getTitle(), movie.getImage(), movie.getYear());

  static Converter<MovieDto, Movie> fromDto = (movie) ->
      new Movie(movie.getMovieId(), movie.getTitle(), movie.getImage(), movie.getYear());

  static Converter<CreateMovieDto, Movie> fromCreateMovieDto = (movie) ->
      new Movie(movie.getTitle(), movie.getImage(), movie.getYear());
}
