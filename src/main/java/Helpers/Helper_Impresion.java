/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Equipo;


/**
 *
 * @author 1058548086
 */
public class Helper_Impresion {
    public static void ImprimirInfoLocal(Equipo equipo) {
        System.out.println("Nombre equipo:" + "\t" + equipo.getNombre() + "\n");
        if (!equipo.getLsjugadores().isEmpty()) {
            for (int i = 0; i < equipo.getLsjugadores().size(); i++) {
                System.out.println("Jugador" + "\t" + (i + 1) + "\n"
                        + "El Nombre del Jugador es" + "\t" + equipo.getLsjugadores().get(i).getNombre() + "\n"
                        + "El Apellido del Jugador es" + "\t" + equipo.getLsjugadores().get(i).getApellido() + "\n"
                        + "La posicion del Jugador es" + "\t" + equipo.getLsjugadores().get(i).getPosicion() + "\n"
                        + "El id del Jugador es" + "\t" + equipo.getLsjugadores().get(i).getId() + "\n"
                        + "El numero  del Jugador es" + "\t" + equipo.getLsjugadores().get(i).getNum_Camisa()+ "\n"
                );

            }
        } else {
            System.out.println("No se ha registrado ningun Jugador, por favor registre un Jugador");
        }
    }
}
