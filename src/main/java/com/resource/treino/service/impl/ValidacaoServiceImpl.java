package com.resource.treino.service.impl;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.service.ValidacaoService;
import com.resource.treino.ws.EnderecoERP;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@Service
public class ValidacaoServiceImpl implements ValidacaoService {

    @Override
    public void validarCep (String cep) {

        String aux = cep.replace("-", "");
        int length = String.valueOf(aux).length();
        if (length != 8) {
            throw new ResponseStatusException(HttpStatus.OK, "CEP_INVALIDO");
        }
    }

    @Override
    public void validarLogradouro(@Valid EnderecoViaCepResponse viaCep, @Valid EnderecoERP soap) {

        if ( viaCep.getLocalidade() == null || soap.getEnd() == null ){

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CEP_INVALIDO");
        }

        if ( !viaCep.getLogradouro().equals(soap.getEnd()) ){

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CEP_NAO_CORRESONDENTE");
        }
    }
}