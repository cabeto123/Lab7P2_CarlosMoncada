/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_carlosmoncada;

import java.awt.Color;

/**
 *
 * @author calol
 */
public class Vehiculo {
       
   String marca;
   String color;
   String modelo;
   int año;
   double precio_venta;
   String id;
   

    public Vehiculo(String marca, String color, String modelo, int año, double precio_venta) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.precio_venta = precio_venta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  marca ;
    }
   
  
   
    
}
