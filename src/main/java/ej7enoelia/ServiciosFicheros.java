/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enoelia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author noelia
 */
public class ServiciosFicheros {
    
    public static void crearDirectorio(String ruta) {
        File directorio = new File(ruta);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
    
    public static void escrituraFactura(String id, List<Factura> lista) {
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(id))) {
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
