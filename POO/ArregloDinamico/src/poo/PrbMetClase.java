/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Usuario
 */
public class PrbMetClase
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MetClase obj = new MetClase();
        obj.x = 17;
        obj.desp();
        
        
        MetClase.y=17;
        MetClase.desp2();
        
        
        
        
        MetClase obj2 = new MetClase();
        obj2.desp();
        MetClase.desp2(); 
        
        String s = new String(); 
        
                
                
    }
    
}
