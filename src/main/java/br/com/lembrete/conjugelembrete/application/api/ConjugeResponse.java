package br.com.lembrete.conjugelembrete.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ConjugeResponse {
	private UUID idConjuge;
}
