package appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.repository;

import appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.Model.bd.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
