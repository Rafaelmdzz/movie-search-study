package br.com.rafael.animedev.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(
        @JsonAlias("Year") String duracao,
        @JsonAlias("Released")String lancamento,
        @JsonAlias("Genre")String genero,
        @JsonAlias ("Poster") String capa,
        @JsonAlias("totalSeasons") Integer temporadas,
        @JsonAlias("imdbRating") String nota
) {
}
