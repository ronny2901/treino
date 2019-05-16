package com.resource.treino.gateway;

import com.resource.treino.ws.EnderecoERP;

public interface EnderecoSoapGateway {

    EnderecoERP buscarCepSoap(String cep);
}
