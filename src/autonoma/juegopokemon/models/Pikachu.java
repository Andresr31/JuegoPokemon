/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.juegopokemon.models;

/**
 *
 * @author Educacion
 */
public class Pikachu extends Pokemon implements PokemonElectrico{
    
    public String atacarColazo() {
       return "Pikachu ha lanzado un atacarColazo";
    }
    
    @Override
    public String atacarPlacar() {
       return "Pikachu ha lanzado un atacarPlacar";
    }

    @Override
    public String atacarRayo() {
       return "Pikachu ha lanzado un atacarRayo";
    }
    
}
