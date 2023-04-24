/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7enoelia;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.DoubleStream;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Factura {
    Random random = new Random();
    
    private String codigo;
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporteFactura;
    private int contador = 0;
    private DoubleStream doubleSt = random.doubles(1, 100, 1000);

    public Factura() {
        this.codigo = String.valueOf(contador++);
        this.fechaEmision = LocalDate.now();
        this.descripcion = RandomStringUtils.randomAlphabetic(10, 21);
        this.totalImporteFactura = Math.round(doubleSt.sum());
    }

    public Factura(String codigo, LocalDate fechaEmision, String descripcion, double totalImporteFactura) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporteFactura = totalImporteFactura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporteFactura() {
        return totalImporteFactura;
    }

    public void setTotalImporteFactura(double totalImporteFactura) {
        this.totalImporteFactura = totalImporteFactura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo);
        sb.append(";").append(fechaEmision);
        sb.append(";").append(descripcion);
        sb.append(";").append(totalImporteFactura);
        return sb.toString();
    }

    

    
    
    
}
