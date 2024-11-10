/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio18;

/**
 *
 * @author Gustavo
 */
import java.util.ArrayList;
import java.util.Random;
public class Ejercito {
    
    String nombre;
    ArrayList<Soldado> soldados;
    public Ejercito(String nombre) {
        this.nombre = nombre;
        this.soldados = new ArrayList<>();
    }
}
