package com.resource.treino.service;

import com.resource.treino.domain.EnderecoViaCepResponse;
import org.springframework.stereotype.Service;

@Service
public interface EnderecoService {

    EnderecoViaCepResponse buscarCep (String cep);
}

