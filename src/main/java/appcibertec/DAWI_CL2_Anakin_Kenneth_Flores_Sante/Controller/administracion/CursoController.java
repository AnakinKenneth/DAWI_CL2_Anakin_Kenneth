package appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.Controller.administracion;

import appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.Service.cursoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/curso")
public class CursoController {
    private cursoService cursoServicie;
    @GetMapping("/frmcurso")
    public String index(Model model){
        model.addAttribute("listacurso",cursoServicie.listadocurso());
        return "administracion/frmcurso";
    }
}
