/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;

/**
 *
 * @author marip
 */
public class PrbCarrosADD
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList <String> obj = new ArrayList <>(); //hace todo lo que hicimos en el PrbArreglo
        
        
        obj.add("Toyota");
        obj.add("Chevrolet");
        obj.add("Audi");
        obj.add("Nissan");
        
        
        
        obj.remove(3); //remueve posición 2
        
        
        
        obj.remove((String)"Audi"); //remueve el dato 8
        
        
        
        for (int i = 0; i < obj.size(); i++) //el size es equivalente al lenght
        {
            System.out.println(obj.get(i));
        }
        
    }
    
}
