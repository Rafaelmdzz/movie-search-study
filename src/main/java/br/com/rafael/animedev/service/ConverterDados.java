package br.com.rafael.animedev.service;

import tools.jackson.databind.ObjectMapper;

public class ConverterDados implements IConvertDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}
