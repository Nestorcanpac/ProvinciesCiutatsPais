package com.example.ProvinciesCiutats.Errors;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String HandlerException(Exception ex, Model model){
        String errorMessage = "S'ha produit un error";

        model.addAttribute("errorMessage",errorMessage);

        return "Error";
    }




}
