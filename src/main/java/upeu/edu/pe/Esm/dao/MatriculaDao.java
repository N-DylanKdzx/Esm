package upeu.edu.pe.Esm.dao;
import java.util.List;
import java.util.Optional;
import upeu.edu.pe.Esm.entity.Matricula;


public interface MatriculaDao {

	Matricula create(Matricula a);
	Matricula update(Matricula a);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}