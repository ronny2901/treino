package com.resource.treino.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AtendeCliente", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
//@XmlSeeAlso({
//    ObjectFactory.class
//})
public interface AtendeCliente {




    /**
     * 
     * @param cep
     * @return
     *     returns br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP
     * @throws SigepClienteException
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaCEP", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEP")
    @ResponseWrapper(localName = "consultaCEPResponse", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", className = "br.com.correios.bsb.sigep.master.bean.cliente.ConsultaCEPResponse")
    public EnderecoERP consultaCEP(
        @WebParam(name = "cep", targetNamespace = "")
        String cep)
        throws SQLException_Exception, SigepClienteException
    ;


}
