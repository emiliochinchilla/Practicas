
package diapositiva22_clase7;

import javax.swing.JOptionPane;

public class Diapositiva22_Clase7 {

 
    public static void main(String[] args) {
              int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
              int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
              int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
              int numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto numero:"));
              
              if (numero1>numero2 && numero1>numero3 && numero1>numero4) {
                  System.out.println("El primer numero es el mayor.");
              } else if (numero2>numero3 && numero2>numero4) {
                  System.out.println("El segundo numero es el mayor.");
              } else if (numero3>numero4) {
                  System.out.println("El tercer numero es el mayor.");   
              } else {
                  System.out.println("El cuarto numero es el mayor.");   
                 
              }
        
        }
    }
    
    

