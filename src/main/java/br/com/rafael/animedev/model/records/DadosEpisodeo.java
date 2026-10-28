package br.com.rafael.animedev.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosEpisodeo(
        @JsonAlias("Title") String titulo,
        //@JsonAlias("Year")String ano,
        //@JsonAlias("Season")String temporada,
        @JsonAlias("Episode")String episodio,
        //@JsonAlias("Runtime")String tempo,
        //@JsonAlias("Poster")String capa,
        @JsonAlias("imdbRating") String nota
) {
}
