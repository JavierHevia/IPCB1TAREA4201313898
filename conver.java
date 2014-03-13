/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conver;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class conver {
    public int celsius(int c){
                String v1= JOptionPane.showInputDialog("Intruduzca el los grados celsius");
                int valor=Integer.parseInt(v1);
                int f= ((9/5)*valor+32);
                int k=(valor+273);
                JOptionPane.showMessageDialog(null,"El valor en fahrenheit es: "+f);
                JOptionPane.showMessageDialog(null,"El valor en kelvin es: "+k);
        return 0;
    }
public int fahrenheit(int f) {
       
                String v1= JOptionPane.showInputDialog("Intruduzca el los grados Fahrenheit");
                int valor=Integer.parseInt(v1);
                int c=((5/9)*(valor-32));
                int k=(c+273);
                JOptionPane.showMessageDialog(null,"El valor en Celsius es: "+c);
                JOptionPane.showMessageDialog(null,"El valor en Kelvin es: "+k);
        return 0;
}
    

    public int kelvin(int k){
                String v1= JOptionPane.showInputDialog("Intruduzca el los grados Kelvin");
                int valor=Integer.parseInt(v1);
                int c=(valor-273);
                int f=((9/5)*(c+32));
                JOptionPane.showMessageDialog(null,"El valor en Celsius es: "+c);
                JOptionPane.showMessageDialog(null,"El valor en Fahrenheit es: "+f); 
        return 0;
    }
}
