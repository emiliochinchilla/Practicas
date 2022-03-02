
package condicionales;

import javax.swing.JOptionPane;

public class Condicionales {


    public static void main(String[] args) {
     int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
     //if anidado
     /*if (edad>=18) {
         System.out.println("Puede votar");
         System.out.println("");
         JOptionPane.showMessageDialog(null, "Puede votar");
     }   
     else {
        JOptionPane.showMessageDialog(null, "No puede votar");
        if (edad <= 12) {
            JOptionPane.showMessageDialog(null, "Es un nino.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Es un adolescente.");
        }
     }*/
     
     if (edad < 12){
         System.out.println("Es un nino.");
     } else if (edad<18) {
         System.out.println("Es un adolescente.");
     } else if (edad<65) {
         System.out.println("Es un adulto");
     } else
            System.out.println("Es un adulto mayor.");
    }
    
}
