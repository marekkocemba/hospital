package pl.hospital.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ClientException.class)
    protected ResponseEntity<Object> handleClientException(ClientException ex) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                ClientExceptionObject
                        .builder()
                        .description(ex.getMessage())
                        .exceptionCode(ex.getCode())
                        .build());
    }

//    @ExceptionHandler(InterruptedException.class)
//    protected ResponseEntity<Object> handleValidationException(InterruptedException ex) {
//
//        return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).build();
//    }
}