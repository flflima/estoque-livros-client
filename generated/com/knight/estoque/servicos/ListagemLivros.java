
package com.knight.estoque.servicos;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ListagemLivros", targetNamespace = "http://servicos.estoque.knight.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ListagemLivros {


    /**
     * 
     * @return
     *     returns java.util.List<com.knight.estoque.servicos.Livro>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarLivros", targetNamespace = "http://servicos.estoque.knight.com/", className = "com.knight.estoque.servicos.ListarLivros")
    @ResponseWrapper(localName = "listarLivrosResponse", targetNamespace = "http://servicos.estoque.knight.com/", className = "com.knight.estoque.servicos.ListarLivrosResponse")
    @Action(input = "http://servicos.estoque.knight.com/ListagemLivros/listarLivrosRequest", output = "http://servicos.estoque.knight.com/ListagemLivros/listarLivrosResponse")
    public List<Livro> listarLivros();

}
