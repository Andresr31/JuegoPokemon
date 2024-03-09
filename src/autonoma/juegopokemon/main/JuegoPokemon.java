/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.juegopokemon.main;

import autonoma.juegopokemon.models.Bulbasaur;
import autonoma.juegopokemon.models.Pikachu;
import autonoma.juegopokemon.models.Pokemon;
import autonoma.juegopokemon.models.PokemonElectrico;

/**
 *
 * @author Educacion
 */
public class JuegoPokemon {
    
    public static void main(String[] args) {
        Pokemon p1 = new Pikachu();
        System.out.println(p1.atacarPlacar());
        
        PokemonElectrico p2 = new Pikachu();
        System.out.println(p2.atacarRayo());
        
        Pikachu p3 = new Pikachu();
        System.out.println(p3.atacarColazo());
    }
    
}
