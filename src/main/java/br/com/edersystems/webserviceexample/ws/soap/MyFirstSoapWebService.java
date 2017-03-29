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

import br.com.edersystems.webserviceexample.entities.Carro;
import br.com.edersystems.webserviceexample.entities.CorType;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Administrador
 */
@WebService
public class MyFirstSoapWebService
{
    @WebMethod
    public String ping(@WebParam(name = "nome") @NotNull String name)
    {
        return "Pong !".concat(name);
    }

    @WebMethod(operationName = "MeDeMinhaIdaePorFavor")
    public Integer getAge()
    {
        return new Random().nextInt();
    }

    public List<String> getMinhaPrimeiraLista()
    {
        List<String> stringsToReturn = new LinkedList<>();
        for(int i = 0; i < 10; i++)
        {
            stringsToReturn.add("Meu Item " + i + 1);
        }
        return stringsToReturn;
    }

    public List<Carro> getMeusCarros()
    {
        List<Carro> carros = new LinkedList<>();
        Carro carro = new Carro("Ford Ecosport", "Ford", CorType.PRATA);
        Carro carro2 = new Carro("Tucson", "Hyundai", CorType.VERMELHO);
        Carro carro3 = new Carro("Cherry Tiggo", "Cherry", CorType.BRANCO);
        Carro carro4 = new Carro("HR-V", "Honda", CorType.VERMELHO);
        carros.add(carro);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        return carros;
    }
}
