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
public class PrbMatriz6D
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Matriz6D obj=new Matriz6D();
        obj.getX()[0][0][0][0][0][0]=1000;
        System.out.println("Matriz de 6 dimensiones \n"+obj.desp());
    }
    
}
