package br.com.lembrete.conjugelembrete.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lembrete.conjugelembrete.domain.Conjuge;

public interface ConjugeSpringDataJPARepository extends JpaRepository<Conjuge, UUID>{
}
