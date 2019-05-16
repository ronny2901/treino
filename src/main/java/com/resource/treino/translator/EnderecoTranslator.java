package com.resource.treino.translator;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.dto.response.DadosResponseDTO;
import com.resource.treino.dto.response.EnderecoResponseDTO;
import com.resource.treino.dto.response.RegiaoResponseDTO;
import com.resource.treino.ws.EnderecoERP;
import org.springframework.stereotype.Component;

@Component
public class EnderecoTranslator {

    public EnderecoResponseDTO toResponse (EnderecoViaCepResponse retorno ) {

        return EnderecoResponseDTO.builder()
                .regiao(RegiaoResponseDTO.builder()
                        .cidade(retorno.getLocalidade())
                        .estado(retorno.getUf())
                        .build())
                .logradouro(retorno.getLogradouro() +" " + retorno.getComplemento())
                .dados(DadosResponseDTO.builder()
                        .cep(retorno.getCep())
                        .bairro(retorno.getBairro())
                        .build())
                .build();
    }

    public EnderecoResponseDTO toResponseSoap (EnderecoERP retorno ) {

        return EnderecoResponseDTO.builder()
                .regiao(RegiaoResponseDTO.builder()
                        .cidade(retorno.getCidade())
                        .estado(retorno.getUf())
                        .build())
                .logradouro(retorno.getEnd() +" " + retorno.getComplemento2())
                .dados(DadosResponseDTO.builder()
                        .cep(retorno.getCep())
                        .bairro(retorno.getBairro())
                        .build())
                .build();
    }
}
