package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.service;

import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Rol;

import java.util.List;

public interface IRolService {
    List <Rol> listarRol();
    Rol guardarRol(Rol rol);
}
