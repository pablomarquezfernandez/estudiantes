package co.gov.javeriana.estudiante.estudiantes.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {

    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
}
