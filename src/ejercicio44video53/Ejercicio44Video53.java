
package ejercicio44video53;

import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio44Video53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int dia,mes,ano;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DIA: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL MES: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL AÑO: "));
        
        if((dia >= 1) && (dia<=30)){
        
            if((mes>=1) && (mes<=12)){
            if(ano !=0){
                JOptionPane.showMessageDialog(null,"FECHA CORRECTA");
            }else{
                JOptionPane.showMessageDialog(null,"FECHA INCORRECTA, AÑO INCORRECTO");
            }
            
            }else{
                JOptionPane.showMessageDialog(null,"FECHA INCORRECTA, MES INCORRECTO");
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null,"FECHA INCORRECTA, DIA INCORRECTO");
        }
    
    
    }}
