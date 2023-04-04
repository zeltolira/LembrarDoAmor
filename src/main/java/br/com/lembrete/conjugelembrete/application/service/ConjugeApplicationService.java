package br.com.lembrete.conjugelembrete.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.lembrete.conjugelembrete.application.api.request.ConjugeRequest;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeDetalhadoResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeListResponse;
import br.com.lembrete.conjugelembrete.application.api.response.ConjugeResponse;
import br.com.lembrete.conjugelembrete.application.repository.ConjugeRepository;
import br.com.lembrete.conjugelembrete.domain.Conjuge;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ConjugeApplicationService implements ConjugeService {

	private final ConjugeRepository conjugeRepository;

	@Override
	public ConjugeResponse criaConjuge(ConjugeRequest conjugeRequest) {
		log.info("[inicia] ConjugeApplicationService - criaConjuge");
		Conjuge conjuge = conjugeRepository.salva(new Conjuge(conjugeRequest));
		log.info("[finaliza] ConjugeApplicationService - criaConjuge");
		return ConjugeResponse.builder()
				.idConjuge(conjuge.getIdConjuge())
				.build();
	}

	@Override
	public List<ConjugeListResponse> buscaTodosConjuges() {
		log.info("[inicia) ConjugeApplicationService - buscaTodosConjuges");
		List<Conjuge> conjuges = conjugeRepository.buscaTodosConjuges();
		log.info("[finaliza) ConjugeApplicationService - buscaTodosConjuges");
		return ConjugeListResponse.converte(conjuges);
	}

	@Override
	public ConjugeDetalhadoResponse buscaConjugeAtravesId(UUID idConjuge) {
		log.info("[inicia) ConjugeApplicationService - buscaConjugeAtravesId");
		Conjuge conjuge =  conjugeRepository.buscaConjugeAtravesId(idConjuge);
		log.info("[finaliza) ConjugeApplicationService - buscaConjugeAtravesId");
		return new ConjugeDetalhadoResponse(conjuge);
	}

	@Override
	public void deletaConjugeAtravesId(UUID idConjuge) {
		log.info("[inicia) ConjugeApplicationService - deletaConjugeAtravesId");
		log.info("[finaliza) ConjugeApplicationService - deletaConjugeAtravesId");
		
	}

}