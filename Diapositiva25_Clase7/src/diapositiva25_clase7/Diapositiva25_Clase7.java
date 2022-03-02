
package diapositiva25_clase7;

import javax.swing.JOptionPane;


public class Diapositiva25_Clase7 {


    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        double sal_semanal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario semanal:"));
        double sal_bruto = sal_semanal*4;
        double deducciones = sal_bruto*0.0934;
        double sal_neto = sal_bruto-deducciones;
        
        System.out.println("Estimado usuario "+nombre+", el salario de este mes se desglosa de la siguiente manera:");
        System.out.println("Salario bruto: "+sal_bruto);
        System.out.println("Deducciones: "+deducciones); 
        System.out.println("Salario neto: "+sal_neto);

    }
    
}
