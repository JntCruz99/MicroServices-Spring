package br.com.jntcruz.FuncionarioMS.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "FUNCIONARIO")
@Getter
@Setter
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long funcionarioId;

    private String nome;

    private String formacao;

    @Column(name = "FOLHAID")
    private Long folhaid;
}
