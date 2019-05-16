package com.resource.treino;

import com.resource.treino.domain.EnderecoViaCepResponse;
import com.resource.treino.service.EnderecoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EnderecoServiceTest {

    private EnderecoService enderecoService;

    @Before
    public void init(){

        EnderecoViaCepResponse viaCep = EnderecoViaCepResponse.builder()
                .cep("05036-040")
                .logradouro("Avenida Marquês de São Vicente")
                .complemento("de 2200/2201 ao fim")
                .bairro("Água Branca")
                .localidade("São Paulo")
                .uf("SP")
                .unidade("")
                .ibge("3550308")
                .gia("1004")
                .build();
    }

    @Test
    public void buscarCepTest(){

        EnderecoViaCepResponse viaCep = EnderecoViaCepResponse.builder()
                .cep("05036-040")
                .logradouro("Avenida Marquês de São Vicente")
                .complemento("de 2200/2201 ao fim")
                .bairro("Água Branca")
                .localidade("São Paulo")
                .uf("SP")
                .unidade("")
                .ibge("3550308")
                .gia("1004")
                .build();

        when(enderecoService.buscarCep("05036-040")).thenReturn(viaCep);

        Assert.assertEquals("05036-040", viaCep.getCep());
        Assert.assertEquals("Avenida Marquês de São Vicente", viaCep.getLogradouro());
        Assert.assertEquals("São Paulo", viaCep.getLocalidade());
    }
}
