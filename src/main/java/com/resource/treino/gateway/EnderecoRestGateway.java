package com.resource.treino.gateway;

import com.resource.treino.domain.EnderecoViaCepResponse;

public interface EnderecoRestGateway {

    EnderecoViaCepResponse buscarCep(String cep);
}
