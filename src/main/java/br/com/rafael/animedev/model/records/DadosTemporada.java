package br.com.rafael.animedev.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DadosTemporada(
        @JsonAlias("Season")Integer temporada,
        @JsonAlias("Episodes")List<DadosEpisodeo> episodeos
) {
}
