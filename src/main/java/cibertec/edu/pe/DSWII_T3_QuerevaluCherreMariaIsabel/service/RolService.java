package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.service;

import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Rol;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.repository.RolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class RolService implements IRolService {
    private RolRepository rolRepository;

    @Override
    public List<Rol> listarRol() {
        return rolRepository.findAll();
    }

    @Override
    public Rol guardarRol(Rol rol) {
        return  rolRepository.save(rol);
    }
}
