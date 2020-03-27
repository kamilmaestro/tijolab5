package pl.edu.pwsztar.utils.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pl.edu.pwsztar.exception.MovieNotFoundException;

@ControllerAdvice
class ErrorHandler {

  @ExceptionHandler(MovieNotFoundException.class)
  public ResponseEntity<String> handleException(MovieNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getClass().getSimpleName());
  }
}
