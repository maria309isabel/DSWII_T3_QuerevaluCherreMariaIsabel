package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "pagos")
public class Pagos {

    @EmbeddedId
    private PagosDetail id;

    @MapsId("idalumno")
    @ManyToOne
    @JoinColumn(name = "idalumno")
    private Alumno alumno;

    private Double monto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

}
