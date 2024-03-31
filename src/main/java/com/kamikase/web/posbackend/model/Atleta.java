package com.kamikase.web.posbackend.model;

import com.kamikase.web.posbackend.validator.EmailValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Atleta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Campo é obrigatório!")
    private String nome;

    @NotNull
    private Integer anoNascimento;

    @NotEmpty(message = "Campo é obrigatório!")
    private String esporte;

    @NotEmpty(message = "Campo é obrigatório!")
    @Email
    @EmailValidation
    private String email;

    @NotEmpty(message = "Campo é obrigatório!")
    @CPF
    private String cpf;

}