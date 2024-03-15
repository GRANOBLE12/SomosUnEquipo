/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1058548086
 */
public class Equipo {
    public String Nombre;
    public ArrayList<Jugador> lsjugadores;
      
    public Equipo(){
        
    }

    public Equipo(String Nombre, ArrayList<Jugador> lsjugadores) {
        this.Nombre = Nombre;
        this.lsjugadores = lsjugadores;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Jugador> getLsjugadores() {
        return lsjugadores;
    }

    public void setLsjugadores(ArrayList<Jugador> lsjugadores) {
        this.lsjugadores = lsjugadores;
    }

    
}

