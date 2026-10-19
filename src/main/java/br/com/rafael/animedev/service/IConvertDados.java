package br.com.rafael.animedev.service;

public interface IConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}
