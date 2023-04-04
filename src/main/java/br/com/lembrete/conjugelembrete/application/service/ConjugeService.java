package br.com.lembrete.conjugelembrete.application.service;

import java.util.List;

import br.com.lembrete.conjugelembrete.application.api.ConjugeListResponse;
import br.com.lembrete.conjugelembrete.application.api.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.ConjugeResponse;

public interface ConjugeService {
	ConjugeResponse criaConjuge(ConjugeRequest conjugeRequest);
	List<ConjugeListResponse> buscaTodosConjuges();
}
