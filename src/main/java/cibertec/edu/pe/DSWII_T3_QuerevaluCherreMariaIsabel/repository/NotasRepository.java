package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.repository;

import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Notas;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.pk.AlumnoCursoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotasRepository extends JpaRepository<Notas, AlumnoCursoId> {
}
