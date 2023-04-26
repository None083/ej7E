/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enoelia;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FX506
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaFacturas {
    
    @XmlElementWrapper(name = "lista")

    @XmlElement(name = "factura")
    
    private List<Factura> listaFacturas = new ArrayList<>();

    public ListaFacturas() {
        
        for (int i = 0; i < 50; i++) {
            listaFacturas.add(new Factura());
        }
        
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }
    
    
    
}
