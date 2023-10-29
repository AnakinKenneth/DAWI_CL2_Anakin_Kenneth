package appcibertec.DAWI_CL2_Anakin_Kenneth_Flores_Sante.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcurso;
    @Column(name = "nomcurso")
    private String nomcurso;
    @Column(name = "credito")
    private String credito;
}
