package com.resource.treino.resource;

import com.resource.treino.domain.EnderecoSoapResponse;
import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.dto.response.EnderecoResponseDTO;
import com.resource.treino.service.EnderecoService;
import com.resource.treino.service.EnderecoServiceSoap;
import com.resource.treino.service.ValidacaoService;
import com.resource.treino.translator.EnderecoTranslator;
import com.resource.treino.ws.EnderecoERP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class EnderecoResource {

    @Autowired
    private EnderecoTranslator translator;

    @Autowired
    private EnderecoService service;

    @Autowired
    private EnderecoServiceSoap serviceSoap;

    @Autowired
    private ValidacaoService valicacaoService;

    @GetMapping("/buscarCep/{cep}")
    public ResponseEntity<EnderecoResponseDTO> buscarCep (@Valid @PathVariable("cep") String cep) {

        EnderecoViaCepResponse response = service.buscarCep(cep);

        EnderecoResponseDTO responseDTO = translator.toResponse(response);

        return ResponseEntity.status(200).body(responseDTO);
    }

    @GetMapping("/cepService/{cep}")
    public ResponseEntity<EnderecoResponseDTO> cepService (@Valid @PathVariable("cep") String cep) {

        EnderecoViaCepResponse viaCepResponse = service.buscarCep ( cep );

        EnderecoERP soapResponse = serviceSoap.buscaCepSoap( cep );

        valicacaoService.validarLogradouro( viaCepResponse, soapResponse );

        EnderecoResponseDTO responseDTO = translator.toResponse ( viaCepResponse );

        return ResponseEntity.status(200).body( responseDTO );
    }

}
