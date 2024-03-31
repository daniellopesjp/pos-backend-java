package com.kamikase.web.posbackend.model.dto;

import lombok.Data;

@Data
public class CepResponseDTO {
    public String cep;
    public String logradouro;
    public String complemento;
    public String bairro;
    public String localidade;
    public String uf;
    public String ibge;
    public String gia;
    public String ddd;
    public String siafi;
}
