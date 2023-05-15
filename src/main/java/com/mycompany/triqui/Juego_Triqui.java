/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triqui;

import java.util.Scanner;

/**
 *
 * @author linan
 */
public class Juego_Triqui {

    public static void main(String[] args) {
        
        //Inicializacion
        Scanner scan = new Scanner(System.in);

        Jugador unJugador = new Jugador();
        Tablero miTablero = new Tablero();
        unJugador.setMiTablero(miTablero);
        unJugador.getMiTablero().seleccionarMarca();
        //Hacer jugada
        int jugadas=0;
        do {
            System.out.println("JUGADOR. Indique el numero de la casilla ");
            int pos = scan.nextInt();
            unJugador.getMiTablero().jugar(pos, unJugador.getMiTablero().getMarca());
            jugadas++;
            unJugador.getMiTablero().jugarMaquina();
            jugadas++;
            unJugador.getMiTablero().mostrarTablero();
            
        } while (jugadas<10);
        
    
    }

}
    
        
    

