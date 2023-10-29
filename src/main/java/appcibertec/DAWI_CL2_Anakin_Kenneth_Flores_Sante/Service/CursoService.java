package appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.Service;

import appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.Model.bd.Curso;
import appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class CursoService {
    private CursoRepository cursoRepository;
    public List<Curso> listadoCurso(){
        return cursoRepository.findAll();
    }
}
