package com.kamikase.web.posbackend.controller;

import com.kamikase.web.posbackend.client.ViaCepClient;
import com.kamikase.web.posbackend.model.Atleta;
import com.kamikase.web.posbackend.model.dto.AtletaDTO;
import com.kamikase.web.posbackend.model.dto.CepResponseDTO;
import com.kamikase.web.posbackend.service.AtletaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/atleta")
@Log4j2
public class AtletaController {
    @Autowired
    private AtletaService service;

    @Autowired
    private ViaCepClient viaCepClient;

    @PostMapping
    public ResponseEntity<Atleta> cadastrar(@RequestBody Atleta atleta) {
        atleta = service.cadastrar(atleta);
        return ResponseEntity.ok(atleta);
    }

    @PutMapping("alterar/{id}")
    public ResponseEntity<Atleta> alterar(Integer id, @RequestBody Atleta clube) {
        clube.setId(id);
        Atleta alteracao = service.alterar(clube);
        return ResponseEntity.ok(alteracao);
    }

    @DeleteMapping("apagar/{id}")
    public ResponseEntity<Void> apagar(@PathVariable Integer id) {
        service.apagar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("buscar/id/{id}")
    public ResponseEntity<AtletaDTO> buscarPorId(Integer id) {

        Atleta atleta = service.listarPorId(id);
        AtletaDTO atletaDTO = new AtletaDTO();

        atletaDTO.setId(atleta.getId());
        atletaDTO.setNome(atleta.getNome());
        atletaDTO.setAnoNascimento(atleta.getAnoNascimento());
        atletaDTO.setEsporte(atleta.getEsporte());
        atletaDTO.setEmail(atleta.getEmail());
        atletaDTO.setCpf(atleta.getCpf());

        return ResponseEntity.ok(atletaDTO);
    }

    @GetMapping("buscar/todos")
    public ResponseEntity<List<AtletaDTO>> buscarTodos() {

        List<Atleta> lista = service.listar();
        List<AtletaDTO> atletas = new ArrayList<>();


        for (Atleta atleta : lista) {
            AtletaDTO atletaDTO = new AtletaDTO();

            atletaDTO.setId(atleta.getId());
            atletaDTO.setNome(atleta.getNome());
            atletaDTO.setAnoNascimento(atleta.getAnoNascimento());
            atletaDTO.setEsporte(atleta.getEsporte());
            atletaDTO.setEmail(atleta.getEmail());
            atletaDTO.setCpf(atleta.getCpf());

            atletas.add(atletaDTO);
        }
        return ResponseEntity.ok(atletas);
    }

    @GetMapping("buscar/todos/asc")
    public ResponseEntity<List<AtletaDTO>> buscarTodosAsc() {

        List<Atleta> lista = service.listarAsc();
        List<AtletaDTO> atletas = new ArrayList<>();


        for (Atleta atleta : lista) {
            AtletaDTO atletaDTO = new AtletaDTO();

            atletaDTO.setId(atleta.getId());
            atletaDTO.setNome(atleta.getNome());
            atletaDTO.setAnoNascimento(atleta.getAnoNascimento());
            atletaDTO.setEsporte(atleta.getEsporte());
            atletaDTO.setEmail(atleta.getEmail());
            atletaDTO.setCpf(atleta.getCpf());

            atletas.add(atletaDTO);
        }
        return ResponseEntity.ok(atletas);
    }

    @GetMapping("buscar/nome/{nome}")
    public ResponseEntity<AtletaDTO> buscarPorNome(String nome) {

        Atleta atleta = service.listarPorNome(nome);
        AtletaDTO atletaDTO = new AtletaDTO();

        atletaDTO.setId(atleta.getId());
        atletaDTO.setNome(atleta.getNome());
        atletaDTO.setAnoNascimento(atleta.getAnoNascimento());
        atletaDTO.setEsporte(atleta.getEsporte());
        atletaDTO.setEmail(atleta.getEmail());
        atletaDTO.setCpf(atleta.getCpf());

        return ResponseEntity.ok(atletaDTO);
    }

    // Consulta externa


    @GetMapping("/cep/{cep}")
    public ResponseEntity<CepResponseDTO> consultarCepAtleta(@PathVariable String cep){

        var cepResponse = viaCepClient.consultaCep(cep);

        return ResponseEntity.ok(cepResponse);
    }



}