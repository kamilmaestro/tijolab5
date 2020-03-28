package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.domain.mapper.MovieListMapperToDto;
import pl.edu.pwsztar.domain.mapper.MovieMapperFromCreateMovieDto;
import pl.edu.pwsztar.domain.repository.MovieRepository;
import pl.edu.pwsztar.exception.MovieNotFoundException;
import pl.edu.pwsztar.service.MovieService;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);

    private final MovieRepository movieRepository;
    private final MovieListMapperToDto movieListMapperToDto;
    private final MovieMapperFromCreateMovieDto movieMapperFromCreateMovieDto;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository,
                            MovieListMapperToDto movieListMapperToDto,
                            MovieMapperFromCreateMovieDto movieMapperFromCreateMovieDto) {

        this.movieRepository = movieRepository;
        this.movieListMapperToDto = movieListMapperToDto;
        this.movieMapperFromCreateMovieDto = movieMapperFromCreateMovieDto;
    }

    @Override
    public List<MovieDto> findAll() {
        List<Movie> movies = movieRepository.findAll();
        return movieListMapperToDto.convert(movies);
    }

    @Override
    public void creatMovie(CreateMovieDto createMovieDto) {
        Movie movie = movieMapperFromCreateMovieDto.convert(createMovieDto);
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Long movieId) throws MovieNotFoundException {
        checkIfMovieExists(movieId);
        movieRepository.deleteById(movieId);
    }

    private void checkIfMovieExists(Long movieId) throws MovieNotFoundException {
        movieRepository.findById(Optional.ofNullable(movieId).orElse(0L))
            .orElseThrow(MovieNotFoundException::new);
    }
}
