package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notas")
public class Notas {

    @EmbeddedId
    private NotasDetail id;

    @MapsId("idalumno")
    @ManyToOne
    @JoinColumn(name = "idalumno")
    private Alumno alumno;

    @MapsId("idcurso")
    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Curso curso;

    private Integer exaparcial;
    private Integer exafinal;
}
