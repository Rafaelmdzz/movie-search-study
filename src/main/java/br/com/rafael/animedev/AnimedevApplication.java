package br.com.rafael.animedev;

import br.com.rafael.animedev.model.DadosTitulo;
import br.com.rafael.animedev.service.ConsumoApi;
import br.com.rafael.animedev.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimedevApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnimedevApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=b89ffafa");
		//System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosTitulo dados = conversor.obterDados(json, DadosTitulo.class);
		System.out.println(dados);
	}
}
