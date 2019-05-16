package com.resource.treino.service.impl;


import com.resource.treino.gateway.impl.EnderecoSoapGatewayImpl;
import com.resource.treino.service.EnderecoServiceSoap;
import com.resource.treino.service.ValidacaoService;
import com.resource.treino.ws.EnderecoERP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EnderecoServiceSoapImpl  implements EnderecoServiceSoap {

    @Autowired
    EnderecoSoapGatewayImpl enderecoSoapGateway;

    @Autowired
    ValidacaoService validacaoService;

    @Override
    public EnderecoERP buscaCepSoap(String cep) {

        EnderecoERP response =null;

        try {
            validacaoService.validarCep(cep);

            response = enderecoSoapGateway.buscarCepSoap(cep);

            if (response.getEnd() == null) {

                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CEP INVALIDO");
            }

        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return response;
    }
}
