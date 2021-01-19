package com.lopes.workshopmongo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lopes.workshopmongo.services.exception.ObjectNotfoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotfoundException.class)
	public ResponseEntity<StandarError>objectNotFound(ObjectNotfoundException e, HttpServletRequest request ){
		
		HttpStatus status = HttpStatus.NOT_FOUND; 
		StandarError err = new StandarError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
