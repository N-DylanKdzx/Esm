package upeu.edu.pe.Esm.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Esm.dao.EmpleadoDao;
import upeu.edu.pe.Esm.entity.Empleado;
import upeu.edu.pe.Esm.service.EmpleadoService;
@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoDao dao;

	@Override
	public Empleado create(Empleado a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Empleado update(Empleado a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}