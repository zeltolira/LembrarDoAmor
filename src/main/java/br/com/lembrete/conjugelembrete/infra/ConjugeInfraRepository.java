package br.com.lembrete.conjugelembrete.infra;

import org.springframework.stereotype.Repository;

import br.com.lembrete.conjugelembrete.application.service.ConjugeRepository;
import br.com.lembrete.conjugelembrete.domain.Conjuge;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ConjugeInfraRepository implements ConjugeRepository {

	@Override
	public Conjuge salva(Conjuge conjuge) {
		log.info("[inicia] ConjugeInfraRepository = salva");
		log.info("[finaliza] ConjugeInfraRepository = salva");
		return null;
	}

}
