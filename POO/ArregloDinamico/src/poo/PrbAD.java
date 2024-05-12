/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;


/**
 *
 * @author LIPYM
 */
public class PrbAD
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList <Integer> obj = new ArrayList <>(); //hace todo lo que hicimos en el PrbArreglo
        
        
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        
        
        
        obj.remove(2); //remueve posición 2
        
        
        
        obj.remove((Integer)8); //remueve el dato 8
        
        
        
        for (int i = 0; i < obj.size(); i++) //el size es equivalente al lenght
        {
            System.out.println(obj.get(i));
        }
        
        
        
        
        // con [j++] primero uso el valor de j y con [++j] primero incremento y luego lo uso
        
        //hacer de tarea un arreglo dinamico sobre carros
    }
    
}
