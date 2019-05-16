package com.resource.treino.gateway.impl;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.gateway.EnderecoRestGateway;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EnderecoRestGatewayImpl implements EnderecoRestGateway {

    public EnderecoViaCepResponse buscarCep(String cep) {

        EnderecoViaCepResponse endereco = new EnderecoViaCepResponse();

        RestTemplate restTemplate = new RestTemplate();
        String uri = "https://viacep.com.br/ws/" + cep + "/json/";

        endereco = restTemplate.getForObject(uri, EnderecoViaCepResponse.class);

        return endereco;
    }

}
