package co.gov.javeriana.estudiante.estudiantes.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MensajeError {

    private String message;
	private Date timestamp;
	private int status;
	private String error;
}
