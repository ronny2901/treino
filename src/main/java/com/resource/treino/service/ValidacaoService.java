package com.resource.treino.service;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.ws.EnderecoERP;
import org.springframework.stereotype.Service;

@Service
public interface ValidacaoService {

    public void validarCep(String cep);

    public void validarLogradouro(EnderecoViaCepResponse viaCep, EnderecoERP soap);
}
