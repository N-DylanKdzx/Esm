package upeu.edu.pe.Esm.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Esm.dao.CursoDao;
import upeu.edu.pe.Esm.entity.Curso;
import upeu.edu.pe.Esm.service.CursoService;
@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoDao dao;

	@Override
	public Curso create(Curso a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Curso update(Curso a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}