
package ejemplodiapositiva12_clase7;

import javax.swing.JOptionPane;


public class EjemploDiapositiva12_Clase7 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        double numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
        double numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto numero:"));
        
        double suma = numero1+numero2+numero3+numero4;
        double resta = numero1-numero2-numero3-numero4;
        double multiplicacion = numero1*numero2*numero3*numero4;
        double division = numero1+numero2+numero3+numero4;
        double promedio = suma/4;
        
        JOptionPane.showMessageDialog(null, "Hola "+nombre+
                ". La suma de los numeros ingresados es: "+suma+
                " La resta de los numeros ingresados es: "+resta+
                " La multiplicacion de los numeros ingresados es: "+multiplicacion+
                " La division de los numeros ingresados es: "+division+
                " El promedio de los numeros ingresados es: "+promedio);
       


    }
    
}
