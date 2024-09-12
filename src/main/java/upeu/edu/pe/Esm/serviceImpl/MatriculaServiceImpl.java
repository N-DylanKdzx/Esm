package upeu.edu.pe.Esm.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Esm.dao.MatriculaDao;
import upeu.edu.pe.Esm.entity.Matricula;
import upeu.edu.pe.Esm.service.MatriculaService;
@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaDao dao;

	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}