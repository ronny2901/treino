package com.resource.treino.service;

import com.resource.treino.ws.EnderecoERP;
import org.springframework.stereotype.Service;

@Service
public interface EnderecoServiceSoap {

    EnderecoERP buscaCepSoap(String cep);
}
