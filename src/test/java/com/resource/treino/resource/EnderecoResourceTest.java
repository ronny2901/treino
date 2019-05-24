package com.resource.treino.resource;

import com.resource.treino.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(EnderecoResource.class)
public class EnderecoResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EnderecoService cepService;
//
//    @Test
//    public void shouldReturnCepResponseByCep() throws Exception {
//        Mockito.when(cepService.buscarCep("05537030")).thenReturn(new EnderecoViaCepResponse());
//        mockMvc.perform(get("/api/cepService/05537030"))
//                .andExpect(status().isOk());
//   }


}
