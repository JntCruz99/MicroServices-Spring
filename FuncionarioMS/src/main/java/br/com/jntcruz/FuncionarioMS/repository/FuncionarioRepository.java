package br.com.jntcruz.FuncionarioMS.repository;

import br.com.jntcruz.FuncionarioMS.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Funcionario findByFolhaid(Long folhaid);
}
