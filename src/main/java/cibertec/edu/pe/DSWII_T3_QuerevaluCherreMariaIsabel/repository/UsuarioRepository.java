package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.repository;

import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //Select * from usuario where nomusuario = 'administrador'
    Usuario findByNomusuario(String nomusuario);
    //Select * from usuario where nombres = 'Maria'
    Usuario findByNombres(String nombres);
}
