/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio18;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) {
        Ejercito ejercitoA = new Ejercito("A");
        Ejercito ejercitoB = new Ejercito("B");

        Batalla batalla = new Batalla(ejercitoA, ejercitoB);
        batalla.mostrarResumenBatalla();
    }
}

