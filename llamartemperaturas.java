/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conver;
/**
 *
 * @author Administrador
 */
public class llamartemperaturas {
    conver ope= new conver();
    
    public int celsiusllamado(int c){
        return ope.celsius(c);
        
    }
    public int fahrenhetisllamado(int f){
        return ope.fahrenheit(f);
        
    }
    public int kelvinllmado(int k){
        return ope.kelvin(k);
        
    }
}


