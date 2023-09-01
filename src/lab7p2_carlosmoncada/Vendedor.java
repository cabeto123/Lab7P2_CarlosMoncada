/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class Vendedor {
    String nombre;
    int cantcarros;
    double dinerogenerado;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantcarros() {
        return cantcarros;
    }

    public void setCantcarros(int cantcarros) {
        this.cantcarros = cantcarros;
    }

    public double getDinerogenerado() {
        return dinerogenerado;
    }

    public void setDinerogenerado(double dinerogenerado) {
        this.dinerogenerado = dinerogenerado;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
