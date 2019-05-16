package com.resource.treino.service.impl;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.gateway.impl.EnderecoRestGatewayImpl;
import com.resource.treino.service.EnderecoService;
import com.resource.treino.service.ValidacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    EnderecoRestGatewayImpl enderecoGateway;

    @Autowired
    ValidacaoService validacaoService;

    public EnderecoViaCepResponse buscarCep(String cep) {

        EnderecoViaCepResponse response = new EnderecoViaCepResponse();

        try {
            validacaoService.validarCep(cep);

            response = enderecoGateway.buscarCep(cep);

            if (response.getLogradouro() == null) {

                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CEP NAO VALIDO");
            }

        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return response;
    }

}
