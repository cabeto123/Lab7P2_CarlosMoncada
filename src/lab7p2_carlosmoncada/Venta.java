/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class Venta {
    Vendedor vdorhizolaoperacion;
    Cliente clientecompro;
    double costotransaccion;
    Vehiculo carroquesevendio;

    public Venta(Vendedor vdorhizolaoperacion, Cliente clientecompro, double costotransaccion, Vehiculo carroquesevendio) {
        this.vdorhizolaoperacion = vdorhizolaoperacion;
        this.clientecompro = clientecompro;
        this.costotransaccion = costotransaccion;
        this.carroquesevendio = carroquesevendio;
    }

    public Vendedor getVdorhizolaoperacion() {
        return vdorhizolaoperacion;
    }

    public void setVdorhizolaoperacion(Vendedor vdorhizolaoperacion) {
        this.vdorhizolaoperacion = vdorhizolaoperacion;
    }

    public Cliente getClientecompro() {
        return clientecompro;
    }

    public void setClientecompro(Cliente clientecompro) {
        this.clientecompro = clientecompro;
    }

    public double getCostotransaccion() {
        return costotransaccion;
    }

    public void setCostotransaccion(double costotransaccion) {
        this.costotransaccion = costotransaccion;
    }

    public Vehiculo getCarroquesevendio() {
        return carroquesevendio;
    }

    public void setCarroquesevendio(Vehiculo carroquesevendio) {
        this.carroquesevendio = carroquesevendio;
    }

    @Override
    public String toString() {
        return  carroquesevendio.toString()   ;
    }
    
   
}
