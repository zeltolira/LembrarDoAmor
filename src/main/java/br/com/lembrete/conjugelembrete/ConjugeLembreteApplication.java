package br.com.lembrete.conjugelembrete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConjugeLembreteApplication {

	@GetMapping("/teste")
	public String getHomeTest() {
		return "Lembrando do meu amor - API Home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConjugeLembreteApplication.class, args);
	}

}
