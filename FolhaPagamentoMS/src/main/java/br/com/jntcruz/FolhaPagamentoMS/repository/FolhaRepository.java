package br.com.jntcruz.FolhaPagamentoMS.repository;

import br.com.jntcruz.FolhaPagamentoMS.entity.Folha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolhaRepository extends JpaRepository<Folha, Long> {
    Folha findByFolhaId(Long folhaId);
}
