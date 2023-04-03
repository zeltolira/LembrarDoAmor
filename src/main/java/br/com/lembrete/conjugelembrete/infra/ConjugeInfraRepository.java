package br.com.lembrete.conjugelembrete.infra;

import org.springframework.stereotype.Repository;

import br.com.lembrete.conjugelembrete.application.repository.ConjugeRepository;
import br.com.lembrete.conjugelembrete.domain.Conjuge;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ConjugeInfraRepository implements ConjugeRepository {


//	private final ConjugeSpringDataJPARepository conjugeSpringDataJPARepository;

	@Override
	public Conjuge salva(Conjuge conjuge) {
		log.info("[inicia] ConjugeInfraRepository - salva");
		//conjugeSpringDataJPARepository.save(conjuge);
		log.info("[finaliza] ConjugeInfraRepository - salva");
		return conjuge;
	}

}