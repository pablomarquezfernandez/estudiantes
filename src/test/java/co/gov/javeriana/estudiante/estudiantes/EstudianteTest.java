package co.gov.javeriana.estudiante.estudiantes;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.gov.javeriana.estudiante.estudiantes.controllers.EstudianteController;
import co.gov.javeriana.estudiante.estudiantes.dto.EstudianteDTO;
import co.gov.javeriana.estudiante.estudiantes.services.EstudianteService;


@SpringBootTest
class EstudianteTest {

    @Autowired
	EstudianteService estudianteController;

	@Test
	void estudianteTest() {

		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");

		int cantidad = estudianteController.get().size();
		EstudianteDTO estudianteDTO = new EstudianteDTO(null, "Pablo", "Márquez", "pablo.marquez@dynaco.co");
		estudianteDTO = estudianteController.save(estudianteDTO);
		int nuevaCantidad = estudianteController.get().size();
		assertEquals(cantidad + 1, nuevaCantidad);

		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		estudianteDTO.setNombres("Pablo Andres");
		estudianteController.update(estudianteDTO);
		EstudianteDTO estudianteActualizadoDTO = estudianteController.get(estudianteDTO.getId());
		assertEquals("Pablo Andres", estudianteActualizadoDTO.getNombres() );

		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");

	}
}
