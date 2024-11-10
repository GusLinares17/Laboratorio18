/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio18;

/**
 *
 * @author Gustavo
 */
import java.util.Random.*;
public class Soldado {
    String nombre;
    int vida;
    public Soldado(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    public int getVida() {
        return vida;
    }
    public String getNombre() {
        return nombre;
    }
    public void incrementarVida() {
        this.vida += 1;
    }
}