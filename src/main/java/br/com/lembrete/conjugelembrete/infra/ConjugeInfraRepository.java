package br.com.lembrete.conjugelembrete.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.lembrete.conjugelembrete.application.repository.ConjugeRepository;
import br.com.lembrete.conjugelembrete.domain.Conjuge;
import br.com.lembrete.conjugelembrete.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ConjugeInfraRepository implements ConjugeRepository {


	private final ConjugeSpringDataJPARepository conjugeSpringDataJPARepository;

	@Override
	public Conjuge salva(Conjuge conjuge) {
		log.info("[inicia] ConjugeInfraRepository - salva");
		conjugeSpringDataJPARepository.save(conjuge);
		log.info("[finaliza] ConjugeInfraRepository - salva");
		return conjuge;
	}

	@Override
	public List<Conjuge> buscaTodosConjuges() {
		log.info("[inicia] ConjugeInfraRepository - buscaTodosConjuges");
		List<Conjuge> todosConjuges = conjugeSpringDataJPARepository.findAll();
		log.info("[finaliza] ConjugeInfraRepository - buscaTodosConjuges");
		return todosConjuges;
	}

	@Override
	public Conjuge buscaConjugeAtravesId(UUID idConjuge) {
		log.info("[inicia] ConjugeInfraRepository - buscaConjugeAtravesId");
		Conjuge conjuge = conjugeSpringDataJPARepository.findById(idConjuge)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Conjuge não encontrado!"));
		log.info("[finaliza] ConjugeInfraRepository - buscaConjugeAtravesId");
		return conjuge;
	}
}