package com.resource.treino.gateway.impl;

import com.resource.treino.gateway.EnderecoSoapGateway;
import com.resource.treino.ws.AtendeCliente;
import com.resource.treino.ws.EnderecoERP;
import com.resource.treino.ws.SQLException_Exception;
import com.resource.treino.ws.SigepClienteException;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

@Component
public class EnderecoSoapGatewayImpl implements EnderecoSoapGateway {

    public EnderecoERP buscarCepSoap(String cep) {

        EnderecoERP endereco = null;
        try {
            URL url = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
            QName qname = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/","AtendeClienteService");
            Service ws = Service.create(url, qname); // interface de chamada
            AtendeCliente atendeCliente = ws.getPort(AtendeCliente.class); //interface de chamada

            endereco = atendeCliente.consultaCEP("05036040"); // classe de retorno

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (SigepClienteException e) {
            e.printStackTrace();
        } catch (SQLException_Exception e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return endereco;
    }
}
