package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    private String idesp;
    private String nomesp;
    private Double costo;

}
