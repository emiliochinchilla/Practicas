
package holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HolaMundo {


    public static void main(String[] args) {
        // Aquí comienza mi primer programa
        // Hecho por: Emilio Chinchilla
        // Aquí comienza mi primer programa
        // Hecho por: Emilio Chinchilla
        /*Scanner lectura = new Scanner(System.in);*/
        String nombre;
        String correo;
        int cantidad;
        /*nombre = "Emilio";
        cantidad = 120;
        System.out.println("Ingrese su nombre:");
        nombre = lectura.next();*/
        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        correo = JOptionPane.showInputDialog("Ingrese su correo:");
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        System.out.print("Hola, "+nombre+".");
        System.out.print("Bienvenido a JAVA, la cantidad de alumnos es: "+cantidad+".");
        
        
    }
    
}
