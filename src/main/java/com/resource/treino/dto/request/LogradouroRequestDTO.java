package com.resource.treino.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogradouroRequestDTO {
    private String tipo;
    private String nome;
    private String numero;
    private String complemento;
}
