package com.kamikase.web.posbackend.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ClubeDTO {
    private Integer id;
    private String nome;
    private String estado;
    private String email;
    private String cnpj;
    private Date dataCriacao;

    public void setRazao_social(String razaoSocial) {
    }

    public void setDetalhes_empresa(Object estabelecimento) {
    }
}