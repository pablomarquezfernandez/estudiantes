package co.gov.javeriana.estudiante.estudiantes.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gov.javeriana.estudiante.estudiantes.dto.EstudianteDTO;
import co.gov.javeriana.estudiante.estudiantes.entity.Estudiante;
import co.gov.javeriana.estudiante.estudiantes.repository.EstudianteRepository;

@Service
public class EstudianteService {

    EstudianteRepository estudianteRepository;
    ModelMapper modelMapper;

    @Autowired
    EstudianteService(EstudianteRepository estudianteRepository, ModelMapper modelMapper){
        this.estudianteRepository = estudianteRepository;
        this.modelMapper = modelMapper;
    }

    public EstudianteDTO get( Long id ){
        Optional<Estudiante>estudianteOpt = estudianteRepository.findById(id);
        EstudianteDTO estudianteDTO = null;
        if( estudianteOpt.isPresent() ){
            Estudiante estuduante = estudianteOpt.get();
            estudianteDTO = modelMapper.map(estuduante, EstudianteDTO.class);
        }
        return estudianteDTO;
    }

    public List<EstudianteDTO> get(  ){
        List<Estudiante> estudiantes =  (List<Estudiante>) estudianteRepository.findAll();

        List<EstudianteDTO> estudianteDTOs = estudiantes.stream()
                                                            .map(estudiante -> modelMapper.map(estudiante, EstudianteDTO.class))
                                                            .collect(Collectors.toList());
       
        return estudianteDTOs;
    }


    public EstudianteDTO save( EstudianteDTO estudianteDTO ){
        Estudiante estudiante =  modelMapper.map(estudianteDTO, Estudiante.class);
        estudiante = estudianteRepository.save(estudiante);
        estudianteDTO = modelMapper.map(estudiante, EstudianteDTO.class);

        return estudianteDTO;

    }


    public EstudianteDTO update( EstudianteDTO estudianteDTO ){
        Estudiante estudiante =  modelMapper.map(estudianteDTO, Estudiante.class);
        estudiante = estudianteRepository.save(estudiante);
        estudianteDTO = modelMapper.map(estudiante, EstudianteDTO.class);

        return estudianteDTO;

    }

    public void delete( Long id ){
        estudianteRepository.deleteById(id);
    }
}
