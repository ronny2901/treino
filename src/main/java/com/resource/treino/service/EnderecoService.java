package com.resource.treino.service;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnderecoService {

    EnderecoViaCepResponse buscarCep (String cep);

    void ordenar(List<Item> itens);
}

