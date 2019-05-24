package com.resource.treino.service;

//@RunWith(MockitoJUnitRunner.class)
public class EnderecoServiceTest {

//    private MockMvc mockMvc;
//
//    @Mock
//    private EnderecoService enderecoService;
//
//    @Mock
//    private ValidacaoServiceImpl validacaoService;
//
//    @MockBean
//    private EnderecoViaCepResponse viaCep;
//
//    @Before
//    public void init(){
//
//        viaCep = EnderecoViaCepResponse.builder()
//                .cep("05036-040")
//                .logradouro("Avenida Marquês de São Vicente")
//                .complemento("de 2200/2201 ao fim")
//                .bairro("Água Branca")
//                .localidade("São Paulo")
//                .uf("SP")
//                .unidade("")
//                .ibge("3550308")
//                .gia("1004")
//                .build();
//    }
//
//    @Test
//    public void buscarCepTest(){
//
//        EnderecoRestGatewayImpl service = Mockito.mock(EnderecoRestGatewayImpl.class);
//
//        EnderecoServiceImpl enderecoRestGatewayImpl = new EnderecoServiceImpl();
//
//        viaCep = service.buscarCep("05036-040");
//
//        Mockito.verify(service, Mockito.times(1)).buscarCep("05036-040");
//    }
//
//    @Test
//    public void buscarCepTestSuccess(){
//
//        enderecoService = new EnderecoServiceImpl();
//
//        viaCep = enderecoService.buscarCep("05036-040");
//
//        Assert.assertNotNull(viaCep);
//    }
//
//    @Test
//    public void buscarCepNullTest() throws Exception {
//
//        enderecoService = new EnderecoServiceImpl();
//
//        viaCep = enderecoService.buscarCep("11111-040");
//
//        Assert.assertNull(viaCep.getLogradouro());
//    }
}