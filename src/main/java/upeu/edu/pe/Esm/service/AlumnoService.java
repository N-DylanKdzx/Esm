package upeu.edu.pe.Esm.service;

import java.util.List;

import java.util.Optional;
import upeu.edu.pe.Esm.entity.Alumno;

public interface AlumnoService {
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
