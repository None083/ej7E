/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7enoelia;


import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author noelia
 */
public class GenerarFicheros {

    public static void main(String[] args) throws JAXBException {

        ListaFacturas listaFacturas = new ListaFacturas();

        ServiciosFicheros.crearDirectorio("xml");
        ServiciosFicheros.crearDirectorio("csv");
        
        ServiciosFicheros.escrituraFactura("csv/facturas.csv", listaFacturas.getListaFacturas());
        
        JAXBContext contexto = JAXBContext.newInstance(ListaFacturas.class);
        
        Marshaller serializador = contexto.createMarshaller();
        

        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


        serializador.marshal(listaFacturas, System.out);

        serializador.marshal(listaFacturas, new File("xml/facturas.xml"));
        
        ServiciosFicheros.crearDirectorio("facturascsv");
        
        ServiciosFicheros.guardarFacturasCsv(listaFacturas.getListaFacturas());
        

    }


}
