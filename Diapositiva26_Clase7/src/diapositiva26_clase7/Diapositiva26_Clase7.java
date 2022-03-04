
package diapositiva26_clase7;

import javax.swing.JOptionPane;


public class Diapositiva26_Clase7 {


    public static void main(String[] args) {
        int antiguedad, horaSemana, precio;
        int bruto;
        int neto = 0;
        
        antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos laborados:"));
        horaSemana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas laboradas por semana:"));
        precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio que se le paga por hora:"));
        
        bruto = (horaSemana)*4*precio;
        
        if (antiguedad>10){
            bruto = (int) (bruto*1.2);
        }
        
        else {
            
        }
        
        
        if (bruto>1000){
                neto = (int) (bruto*0.9);
                JOptionPane.showMessageDialog(null, "Su salario neto es "+neto);

        }else if (bruto>2000){
                neto = (int) (bruto*0.85);
                JOptionPane.showMessageDialog(null, "Su salario neto es "+neto);
                
        }
        else {
            JOptionPane.showMessageDialog(null, "Su salario neto es "+bruto);
                
        }
    }

}
