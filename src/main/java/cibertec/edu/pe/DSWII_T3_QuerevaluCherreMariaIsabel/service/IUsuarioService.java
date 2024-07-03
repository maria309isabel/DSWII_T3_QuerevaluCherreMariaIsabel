package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.service;

import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
