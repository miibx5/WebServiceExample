/*
 *  Projeto.......: WebServiceExample
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2017
 *  Criação.......: 28/03/2017, 21:59:16
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2017 - All Rights Reserved
 *  .....................................................................................
 */
package br.com.edersystems.webserviceexample.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luciano
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Carro implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    @XmlElement
    private String nome;

    @XmlElement
    private String marca;

    @XmlElement
    private CorType color;

    public Carro()
    {
    }

    public Carro(String nome, String marca, CorType color)
    {
        this.nome = nome;
        this.marca = marca;
        this.color = color;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public CorType getColor()
    {
        return color;
    }

    public void setColor(CorType color)
    {
        this.color = color;
    }

}
