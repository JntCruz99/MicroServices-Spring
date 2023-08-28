package br.com.jntcruz.FolhaPagamentoMS.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "FOLHA")
@Getter
@Setter
public class Folha implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long folhaId;

    private double salario;

    private String funcao;

    @Transient
    private Funcionario funcionario;
}
