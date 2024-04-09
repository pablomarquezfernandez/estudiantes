package co.gov.javeriana.estudiante.estudiantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.gov.javeriana.estudiante.estudiantes.dto.EstudianteDTO;
import co.gov.javeriana.estudiante.estudiantes.services.EstudianteService;

@RestController
@RequestMapping(value = "/api/javeriana/estudiante/estudiante")
public class EstudianteController {

    
    EstudianteService estudianteService;

    
    @Autowired
    EstudianteController( EstudianteService estudianteService ){
        this.estudianteService = estudianteService;
    }
    

    @CrossOrigin
    @GetMapping(  value = "/{id}",   produces = MediaType.APPLICATION_JSON_VALUE)
    public EstudianteDTO get( @PathVariable Long id ){
        return estudianteService.get(id);
    }

    @CrossOrigin
    @GetMapping(     produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EstudianteDTO> get(  ){
        return estudianteService.get();
    }

    @CrossOrigin
    @PostMapping(     produces = MediaType.APPLICATION_JSON_VALUE)
    public EstudianteDTO save(  @RequestBody EstudianteDTO estudiante  ){
        return estudianteService.save(estudiante);
    }

    @CrossOrigin
    @PutMapping(     produces = MediaType.APPLICATION_JSON_VALUE)
    public EstudianteDTO update(  @RequestBody EstudianteDTO estudiante  ){
        return estudianteService.save(estudiante);
    }


    @CrossOrigin
    @DeleteMapping(  value = "/{id}",   produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete( @PathVariable Long id ){
        estudianteService.delete(id);
    }
}
