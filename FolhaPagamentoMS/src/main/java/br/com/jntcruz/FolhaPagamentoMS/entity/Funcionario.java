package br.com.jntcruz.FolhaPagamentoMS.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Funcionario  implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long funcionarioId;

    private String nome;

    private String formacao;
}
