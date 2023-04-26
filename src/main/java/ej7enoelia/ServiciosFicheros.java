/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enoelia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

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
            for (Factura f : lista) {
                flujo.write(f.toString());
                flujo.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarFacturasCsv(List<Factura> lista) {
        for (Factura f : lista) {
            try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("facturascsv/" + f.getCodigo() + ".csv"))) {
                    flujo.write(f.toString());   
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void listarDirectorio(String ruta) {

        File f = new File(ruta);
        if (f.exists()) {
            File[] ficheros = f.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }
    
    public static void borrarElemento(String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + ruta + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no está vacío");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + ruta);
        }
    }
    
    public static void lecturaFactura(String id, List<Factura> lista) {
        String linea;
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                lista.add(new Factura(tokens[0], LocalDate.parse(tokens[1]), 
                        tokens[2], Double.valueOf(tokens[3])));
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
