
package ejercicioswitch;

import javax.swing.JOptionPane;


public class EjercicioSwitch {

   
    public static void main(String[] args) {
      int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia:"));
      
        switch (dia) {
            case 1:
                System.out.println("Es Domingo");
                break;
            case 2:
                System.out.println("Es Lunes");
                break;
            case 3:
                System.out.println("Es Martes");
                break;
            case 4:
                System.out.println("Es Miercoles");
                break;
            case 5:
                System.out.println("Es Jueves");
                break;
            case 6:
                System.out.println("Es Viernes");
                break;
            case 7:
                System.out.println("Es Sabado");
                break;
            default:
                System.out.println("Valor incorrecto");
                break;
        }
    }
}

