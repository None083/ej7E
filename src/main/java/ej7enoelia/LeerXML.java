/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7enoelia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author FX506
 */
public class LeerXML {

    public static void main(String[] args) throws JAXBException, 
            FileNotFoundException {

        JAXBContext contexto = JAXBContext.newInstance(ListaFacturas.class);

        Unmarshaller um = contexto.createUnmarshaller();

        ListaFacturas catalogo = (ListaFacturas) um.unmarshal(new File("xml/facturas.xml"));

        List<Factura> listaFacturas = catalogo.getListaFacturas();

        listaFacturas.forEach(System.out::println);
        
    }
    
}
