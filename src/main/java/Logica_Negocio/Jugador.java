/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1058548086
 */
public class Jugador {

    public String Nombre;
    public String Apellido;
    public String Id;
    public String Posicion;
    public int Num_Camisa;
    
    public Jugador(){
        
    }

    public Jugador(String Nombre, String Apellido, String Id, String Posicion, int Num_Camisa) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Id = Id;
        this.Posicion = Posicion;
        this.Num_Camisa = Num_Camisa;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public void setNum_Camisa(int Num_Camisa) {
        this.Num_Camisa = Num_Camisa;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getId() {
        return Id;
    }

    public String getPosicion() {
        return Posicion;
    }

    public int getNum_Camisa() {
        return Num_Camisa;
    }

}
