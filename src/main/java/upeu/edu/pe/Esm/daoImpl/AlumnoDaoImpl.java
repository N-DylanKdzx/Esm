package upeu.edu.pe.Esm.daoImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import upeu.edu.pe.Esm.dao.AlumnoDao;
import upeu.edu.pe.Esm.entity.Alumno;
import upeu.edu.pe.Esm.repository.AlumnoRepository;

@Component
public class AlumnoDaoImpl implements AlumnoDao {

	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
