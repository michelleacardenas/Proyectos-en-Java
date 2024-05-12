/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author LIPYM
 */
public class PrbArregloDinamico
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArregloDinamico obj;
        obj = new ArregloDinamico();
        
        System.out.println(obj);
        
        //se insertan los datos
        obj.inserta(2);
        obj.inserta(3);
        obj.inserta(4);
        obj.inserta(5);
        
        System.out.println(obj.desp());
        
        obj.elimina(2); //elimina posicion 2
        
        System.out.println(obj.desp());
        
        
        obj.eliminadato(0, 5); //elimina el dato 5
        
        System.out.println(obj.desp());
        
        
        
    }
    
}
