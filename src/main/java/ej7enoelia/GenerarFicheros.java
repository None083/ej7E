/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7enoelia;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class GenerarFicheros {

    public static void main(String[] args) {

        List<Factura> listaFacturas = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            listaFacturas.add(new Factura());
        }

        for (Factura f : listaFacturas) {
            System.out.println(f);
        }
        
        ServiciosFicheros.crearDirectorio("xml");
        ServiciosFicheros.crearDirectorio("csv");
        
        

    }


}
