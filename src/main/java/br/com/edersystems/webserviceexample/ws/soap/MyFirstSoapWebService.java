/*
 *  Project............: WebServiceExample
 *  Developer..........: Éder Luciano da Costa
 *  Copyright..........: 2017
 *  Creation...........: 21/03/2017, 11:18:32
 *  Codification.......: UTF-8 (Utilizado na criação do arquivo)
 *  User...............: Éder
 *  ......................................................................................
 *  Éder Luciano da Costa - © Copyright 2017 - All Rights Reserved.
 *  ......................................................................................
 */
package br.com.edersystems.webserviceexample.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Administrador
 */
@WebService
public class MyFirstSoapWebService
{
    @WebMethod
    public String ping(String name)
    {
        return "Pong !".concat(name);
    }
}
