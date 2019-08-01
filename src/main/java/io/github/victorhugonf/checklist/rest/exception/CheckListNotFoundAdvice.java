package io.github.victorhugonf.checklist.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CheckListNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(CheckListNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String checkListNotFoundHandler(CheckListNotFoundException ex){
        return ex.getMessage();
    }

}
