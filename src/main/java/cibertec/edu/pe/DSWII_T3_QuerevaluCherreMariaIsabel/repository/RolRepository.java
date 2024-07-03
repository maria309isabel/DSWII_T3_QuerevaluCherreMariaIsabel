package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.repository;


import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    //Select * from rol where nomrol = 'ADMIN'
    Rol findByNomrol(String nomrol);

}
