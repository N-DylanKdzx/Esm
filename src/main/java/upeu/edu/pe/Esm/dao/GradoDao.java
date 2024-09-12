package upeu.edu.pe.Esm.dao;
import java.util.List;
import java.util.Optional;
import upeu.edu.pe.Esm.entity.Grado;


public interface GradoDao {

	Grado create(Grado a);
	Grado update(Grado a);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}