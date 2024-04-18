package co.gov.javeriana.estudiante.estudiantes.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/javeriana/estudiante/excepcion")
public class ExcepcionController {

    @CrossOrigin
    @GetMapping(   produces = MediaType.APPLICATION_JSON_VALUE)
    public void get(  ) throws Exception{
        throw new Exception("Mensaje de error");
    }
}
