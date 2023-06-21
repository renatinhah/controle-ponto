package com.renata.controledeponto.service;

import com.renata.controledeponto.model.JornadaTrabalho;
import com.renata.controledeponto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {
//    @Autowired  -> antes usava aqui, no padrão novo coloca no construtor
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return   jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void delete(Long idJornada) {
        jornadaTrabalhoRepository.deleteById(idJornada);
    }
}
