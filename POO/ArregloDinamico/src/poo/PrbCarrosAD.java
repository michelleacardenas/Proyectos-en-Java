/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author marip
 */
public class PrbCarrosAD
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CarrosAD obj;
        obj = new CarrosAD();
        
        System.out.println(obj);
        
        //se insertan los datos
        obj.inserta("Nissan");
        obj.inserta("Hyundai");
        obj.inserta("Toyota");
        obj.inserta("Audi");
        
        System.out.println(obj.desp());
        
        obj.elimina(2); //elimina posicion 2
        
        System.out.println(obj.desp());
        
        
        obj.eliminadato(0, "Audi"); //elimina el dato 5
        
        System.out.println(obj.desp());
        
    }
    
}
