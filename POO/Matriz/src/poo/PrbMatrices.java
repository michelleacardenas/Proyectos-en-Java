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
public class PrbMatrices
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Matrices obj= new Matrices();
        obj.getX()[1][2]=3000;
        System.out.println(obj.desp());
        
        
       
    }
    
}
