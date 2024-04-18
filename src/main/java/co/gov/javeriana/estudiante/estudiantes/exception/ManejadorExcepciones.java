package co.gov.javeriana.estudiante.estudiantes.exception;


import java.util.Calendar;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ManejadorExcepciones {

    public static final String INTERNAL_SERVER_ERROR = "Internal server error";

    @ExceptionHandler(Exception.class)
	public ResponseEntity<MensajeError> exception(Exception ex) {
		ex.printStackTrace();
		MensajeError mensajeError = new MensajeError("Error en la firma", Calendar.getInstance().getTime(), 500, INTERNAL_SERVER_ERROR);
		HttpHeaders responseHeaders = new HttpHeaders();
		return new ResponseEntity<>(mensajeError, responseHeaders, HttpStatus.UNAUTHORIZED);

	}

}
