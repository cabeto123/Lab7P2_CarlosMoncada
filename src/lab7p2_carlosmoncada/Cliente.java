/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class Cliente {
    String nombre;
    int edad;
    String profesion;
    int carroscomprados;
    double sueldodisponible;

    public Cliente(String nombre, int edad, String profesion, double sueldodisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.sueldodisponible = sueldodisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCarroscomprados() {
        return carroscomprados;
    }

    public void setCarroscomprados(int carroscomprados) {
        this.carroscomprados = carroscomprados;
    }

    public double getSueldodisponible() {
        return sueldodisponible;
    }

    public void setSueldodisponible(double sueldodisponible) {
        this.sueldodisponible = sueldodisponible;
    }
    
    
}
