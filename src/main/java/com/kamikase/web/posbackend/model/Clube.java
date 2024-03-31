package com.kamikase.web.posbackend.model;

import com.kamikase.web.posbackend.validator.EmailValidation;
import com.kamikase.web.posbackend.validator.NomeClubeValidation;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

@Getter
@Setter
@Data
@Entity
public class Clube {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NomeClubeValidation
    @NotEmpty(message = "Campo é obrigatório!")
    private String nome;

    @NotEmpty(message = "Campo é obrigatório!")
    private String estado;

    @Email
    @EmailValidation
    @NotEmpty(message = "Campo é obrigatório!")
    private String email;

    @CNPJ
    @NotEmpty(message = "Campo é obrigatório!")
    private String cnpj;

    @NotEmpty(message = "Campo é obrigatório!")
    private String dataCriacao;

}
