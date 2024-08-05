package dev.patika.ecommerce.core.config;

import dev.patika.ecommerce.core.exception.NotFoundException;
import dev.patika.ecommerce.core.result.Result;
import dev.patika.ecommerce.core.result.ResultData;
import dev.patika.ecommerce.core.utilies.Msg;
import dev.patika.ecommerce.core.utilies.ResultHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Result> handleNotFoundException(NotFoundException e) {
        return new ResponseEntity<>(ResultHelper.notFoundError(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResultData<List<String>>> handleValidationErrors(MethodArgumentNotValidException e) {

        //id boş olamaz,name dolu olmak zorunda gibi bütün validation hatalarını listeye attı
        List<String> validationErrorList = e.getBindingResult().getFieldErrors().stream()
                .map(FieldError:: getDefaultMessage)
                .collect(Collectors.toList());
        return new ResponseEntity<>(ResultHelper.validateError(validationErrorList), HttpStatus.BAD_REQUEST);

    }
}
