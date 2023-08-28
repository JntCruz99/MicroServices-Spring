package br.com.jntcruz.FolhaPagamentoMS.service;

import br.com.jntcruz.FolhaPagamentoMS.entity.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FuncionarioService {
    @GetMapping(value = "/funcionario/folha/{folhaId}")
    Funcionario findByFolhaid (@PathVariable("folhaId") Long folhaId);

}
