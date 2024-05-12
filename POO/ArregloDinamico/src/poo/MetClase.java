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
public class MetClase
{
    int x=7; //
    
    static int y=10;
    
    public  MetClase()
    {
        y++;
    }
    
    public  void desp()
    {
        System.out.println(x);
        System.out.println(y);
    }
    
    
    public  static void desp2()
    {
        //System.out.println(x)     esta linea, no es aceptada puesto que es una variable de instancia en un metodo de clase
        System.out.println(y);
        
        
    }
    
    
    
    
    
    
    
    
    
}
