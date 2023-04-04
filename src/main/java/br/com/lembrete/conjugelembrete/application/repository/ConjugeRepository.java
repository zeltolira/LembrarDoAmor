package br.com.lembrete.conjugelembrete.application.repository;

import java.util.List;

import br.com.lembrete.conjugelembrete.application.api.ConjugeListResponse;
import br.com.lembrete.conjugelembrete.domain.Conjuge;

public interface ConjugeRepository {
	Conjuge salva(Conjuge conjuge);
	List<ConjugeListResponse> buscaTodosConjuges();
}
