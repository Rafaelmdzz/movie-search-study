package br.com.rafael.animedev.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DadosTitulo(
        @JsonAlias("Year") String duracao,
        @JsonAlias("Released")String lancamento,
        @JsonAlias("Genre")String genero,
        @JsonAlias ("Poster") String capa,
        @JsonAlias("totalSeasons") String temporadas,
        @JsonAlias("imdbRating") String nota
) {
}
