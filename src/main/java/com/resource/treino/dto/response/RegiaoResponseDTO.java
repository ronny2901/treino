package com.resource.treino.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegiaoResponseDTO {
    private String cidade;
    private String estado;

}