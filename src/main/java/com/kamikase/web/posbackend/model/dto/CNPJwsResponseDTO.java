package com.kamikase.web.posbackend.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CNPJwsResponseDTO {
    private String raz_social;
    private Object eslecimento;

    public String getRazao_social() {
        return  raz_social;
    }

    public Object getEstabelecimento() {
        return eslecimento;
    }
}