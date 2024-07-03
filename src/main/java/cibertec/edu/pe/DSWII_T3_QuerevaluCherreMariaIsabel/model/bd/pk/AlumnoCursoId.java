package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@Embeddable
public class AlumnoCursoId implements Serializable {
    private String idalumno;
    private String idcurso;
}
