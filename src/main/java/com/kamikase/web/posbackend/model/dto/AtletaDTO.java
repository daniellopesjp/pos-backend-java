package com.kamikase.web.posbackend.model.dto;

import lombok.Data;


@Data
public class AtletaDTO {

    private Integer id;
    private String nome;
    private Integer anoNascimento;
    private String esporte;
    private String email;
    private String cpf;

}
