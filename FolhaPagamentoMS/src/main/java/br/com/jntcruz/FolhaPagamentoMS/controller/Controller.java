package br.com.jntcruz.FolhaPagamentoMS.controller;

import br.com.jntcruz.FolhaPagamentoMS.entity.Folha;
import br.com.jntcruz.FolhaPagamentoMS.entity.Funcionario;
import br.com.jntcruz.FolhaPagamentoMS.repository.FolhaRepository;
import br.com.jntcruz.FolhaPagamentoMS.service.FuncionarioService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/folhas")
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FolhaRepository folhaRepository;

    @Autowired
    FuncionarioService funcionarioService;


    @GetMapping
    public List<Folha> all(){
        return folhaRepository.findAll();
    }

    @GetMapping(value = "/{folhaId}")
    @CircuitBreaker(name = "produtoA", fallbackMethod = "fallback")
    public Folha findByAccountId (@PathVariable Long folhaId){
        Folha folha = folhaRepository.findByFolhaId(folhaId);

        Funcionario funcionario = funcionarioService.findByFolhaid(folhaId);

        folha.setFuncionario(funcionario);

        return folha;
    }

    public Folha fallback(Long id, Exception e) {
        Folha folha = folhaRepository.findByFolhaId(id);
        return folha;
    }


}
