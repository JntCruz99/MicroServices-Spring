package br.com.jntcruz.FuncionarioMS.controller;

import br.com.jntcruz.FuncionarioMS.entity.Funcionario;
import br.com.jntcruz.FuncionarioMS.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/funcionario")
public class Controller {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public ResponseEntity<?> all(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioRepository.findById(id));
    }

    @GetMapping("/folha/{folhaId}")
    public Funcionario findFolha(@PathVariable Long folhaId){
        return funcionarioRepository.findByFolhaid(folhaId);
    }


}
