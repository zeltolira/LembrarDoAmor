package br.com.lembrete.conjugelembrete.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.lembrete.conjugelembrete.domain.Conjuge;

public interface ConjugeRepository {
	Conjuge salva(Conjuge conjuge);
	List<Conjuge> buscaTodosConjuges();
	Conjuge buscaConjugeAtravesId(UUID idConjuge);
	void deletaConjugeAtravesId(Conjuge conjuge);
}
