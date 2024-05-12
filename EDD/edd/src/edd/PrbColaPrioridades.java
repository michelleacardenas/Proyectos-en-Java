/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class PrbColaPrioridades
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ColaPrioridades obj = new ColaPrioridades(4);
        
        obj.inserta('z');
        obj.inserta('k');
        obj.inserta('l');
        obj.inserta('e');
        
        obj.ordenaCola();
        
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
        

        
        
        
        
        
    }
    
}
