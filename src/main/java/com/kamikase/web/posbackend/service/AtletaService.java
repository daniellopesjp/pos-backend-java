
package com.kamikase.web.posbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamikase.web.posbackend.model.Atleta;
import com.kamikase.web.posbackend.repository.AtletaRepository;

import java.util.List;
import java.util.Objects;

@Service
public class AtletaService {
    @Autowired
    private AtletaRepository atletaRepository;

    public Atleta cadastrar(Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    public List<Atleta> listar() {
        return atletaRepository.findAll();
    }

    public List<Atleta> listarAsc() {
        return atletaRepository.findAllByOrderByNomeAsc();
    }

    public Atleta listarPorNome(String nome) {
        return atletaRepository.findByNome(nome);
    }

    public Atleta listarPorId(Integer id) {
        return atletaRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Atleta alterar(Atleta atleta) {
        if (Objects.isNull(atleta.getId())) {
            throw new RuntimeException();
        }
        return atletaRepository.save(atleta);
    }

    public void apagar(Integer id) {
        atletaRepository.deleteById(id);
    }

}