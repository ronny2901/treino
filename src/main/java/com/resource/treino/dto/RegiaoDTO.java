package com.resource.treino.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegiaoDTO {
    private String cidade;
    private String estado;
}
