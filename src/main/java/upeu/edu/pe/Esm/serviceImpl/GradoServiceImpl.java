package upeu.edu.pe.Esm.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Esm.dao.GradoDao;
import upeu.edu.pe.Esm.entity.Grado;
import upeu.edu.pe.Esm.service.GradoService;
@Service
public class GradoServiceImpl implements GradoService {

	@Autowired
	private GradoDao dao;

	@Override
	public Grado create(Grado a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Grado update(Grado a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}