package com.resource.treino.service.impl;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.domain.Fornecedor;
import com.resource.treino.domain.Item;
import com.resource.treino.gateway.EnderecoRestGateway;
import com.resource.treino.gateway.impl.EnderecoRestGatewayImpl;
import com.resource.treino.service.EnderecoService;
import com.resource.treino.service.ValidacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    EnderecoRestGateway enderecoGateway;

    @Autowired
    ValidacaoService validacaoService;

    public EnderecoViaCepResponse buscarCep(String cep) {

        EnderecoViaCepResponse response = new EnderecoViaCepResponse();

        enderecoGateway = new EnderecoRestGatewayImpl();

        validacaoService = new ValidacaoServiceImpl();

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

    public void ordenar(List<Item> lista){

        separar(lista);
    }

    public Map<Fornecedor, List<Item>> separar (List<Item> itens){

        Map<Fornecedor, List<Item>> retorno = new HashMap<Fornecedor, List<Item>>();
        
        Map<Fornecedor, Item> result3;

        for (Item i : itens){
            itens.stream().collect(
                    Collectors.toMap(x -> x.getFornecedor(), x -> x.getProduto()));
            retorno.put(i.getFornecedor(),itens);
        }

        Map<Fornecedor, List<Item>> treeMap = new TreeMap<Fornecedor, List<Item>> (retorno);
        printMap(treeMap);

        return retorno;
    }

    public static <K, V> void printMap(Map<Fornecedor, List<Item>> map) {
        for (Map.Entry<Fornecedor, List<Item>>
                entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

}
