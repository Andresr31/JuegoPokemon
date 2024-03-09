/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.juegopokemon.models;

/**
 *
 * @author Educacion
 */
public abstract class Pokemon {
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Atributos
    private int numPokedex;
    private String nombre;
    private double peso;
    private int temporada;
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Constructor

    public Pokemon(int numPokedex, String nombre, double peso, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    public Pokemon(){
        
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Metodos de acceso

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos comunes
    
    public abstract String atacarPlacar();
    
    
    
}
