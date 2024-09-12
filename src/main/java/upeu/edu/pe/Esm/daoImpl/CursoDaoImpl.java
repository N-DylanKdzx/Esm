package upeu.edu.pe.Esm.daoImpl;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Esm.dao.CursoDao;
import upeu.edu.pe.Esm.entity.Curso;
import upeu.edu.pe.Esm.repository.CursoRepository;

@Component
public class CursoDaoImpl implements CursoDao {

	@Autowired
	private CursoRepository repository;
	
	@Override
	public Curso create(Curso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Curso update(Curso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
