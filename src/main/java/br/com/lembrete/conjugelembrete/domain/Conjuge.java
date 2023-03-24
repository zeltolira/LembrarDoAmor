package br.com.lembrete.conjugelembrete.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.lembrete.conjugelembrete.application.api.ConjugeRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "conjuge")
public class Conjuge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idConjuge;
	@NotBlank
	private String nomeConjuge;
	@NotNull
	private Sexo sexo;
	@NotBlank
	private String celular;
	@NotNull
	private LocalDate dataNascimento;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraUltimaAlteracao;

	public Conjuge(ConjugeRequest conjugeRequest) {
		this.nomeConjuge = conjugeRequest.getNome();
		this.sexo = conjugeRequest.getSexo();
		this.celular = conjugeRequest.getCelular();
		this.dataNascimento = conjugeRequest.getDataNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
		}
}
