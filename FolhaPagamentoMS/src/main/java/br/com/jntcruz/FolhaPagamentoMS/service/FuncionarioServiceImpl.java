package br.com.jntcruz.FolhaPagamentoMS.service;

import br.com.jntcruz.FolhaPagamentoMS.entity.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;

    public Funcionario findByFolhaid(Long folhaId) {
        return restTemplate.getForObject("http://FUNCIONARIO-MS/funcionario/folha/" + folhaId, Funcionario.class);
    }


}
