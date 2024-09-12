package upeu.edu.pe.Esm.dao;

import java.util.List;

import java.util.Optional;
import upeu.edu.pe.Esm.entity.Alumno;


public interface AlumnoDao {

	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
