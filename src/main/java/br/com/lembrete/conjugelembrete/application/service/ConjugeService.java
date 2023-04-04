package br.com.lembrete.conjugelembrete.application.service;

import java.util.List;

import br.com.lembrete.conjugelembrete.application.api.request.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeDetalhadoResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeListResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeResponse;

public interface ConjugeService {
	ConjugeResponse criaConjuge(ConjugeRequest conjugeRequest);
	List<ConjugeListResponse> buscaTodosConjuges();
	ConjugeDetalhadoResponse buscaConjugeAtravesId();
}
