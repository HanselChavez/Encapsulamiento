/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import java.util.logging.Logger;

/**
 *
 * @author Chavez Garcia Hansel     
 */
public class Persona {
    private String nombre;
    private Integer edad;
    private double peso;
    private String dni;

    public Persona(String nombre, Integer edad, double peso, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dni = dni;
    }
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String nombre, Integer edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    
    /**
     * Esta función permite encapsular el nombre de la persona
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public Integer getEdad(){
        return this.edad;
    }
    
   
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
  
    public void setDni(String dni){
        this.dni = dni;
    }
    public String getDni(){
        return this.dni;
    }
    
    
}
