package cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.service;

import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.model.bd.Notas;
import cibertec.edu.pe.DSWII_T3_QuerevaluCherreMariaIsabel.repository.NotasRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class NotasService implements INotasService{
    NotasRepository notasRepository;

    @Override
    public List<Notas> listarNotas() {

        return notasRepository.findAll();
    }
}


