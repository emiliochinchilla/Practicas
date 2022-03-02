
package ejemplodiapositiva18_clase7;

import javax.swing.JOptionPane;


public class EjemploDiapositiva18_Clase7 {

    public static void main(String[] args) {
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese La nota final del curso anterior:"));
       
        if (nota>=70){
            JOptionPane.showMessageDialog(null, "Aprobo el curso.");
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Reprobo el curso.");
        }
                
    }
    
}
