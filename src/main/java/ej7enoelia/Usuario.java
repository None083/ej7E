/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7enoelia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class Usuario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        List<Factura> listaFacturas = new ArrayList<>();
        String fac1 = "";
        
        do{
            
            ServiciosFicheros.listarDirectorio("facturascsv");
            System.out.println("¿Qué factura desea leer?");
            fac1 = teclado.nextLine();
            ServiciosFicheros.lecturaFactura("facturascsv/" + fac1 + ".csv", listaFacturas);
            System.out.println("--------Lista de facturas eliminadas---------");
            for (Factura f : listaFacturas) {
                System.out.println(f);
            }
            ServiciosFicheros.borrarElemento("facturascsv/" + fac1 + ".csv");
            
        }while(!fac1.equalsIgnoreCase("0"));
        
    }
    
}
