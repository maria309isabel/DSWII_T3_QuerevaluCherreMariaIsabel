package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    private String idalumno;
    private String apealumno;
    private String nomalumno;
    @ManyToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;
    private Character proce;

}
