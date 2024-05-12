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
public class PrbOperaciones
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Operaciones obj=new Operaciones(5,2);
        System.out.println(obj.desp());
        //DIVISION
        System.out.println(obj.div()); 
        System.out.println(obj.div(2.5,3)); //llama automaticamente al método con int y double
        System.out.println(obj.div(9999,(long)5555)); //CAST para llamar a long int
        //MULTIPLICACION
        System.out.println(obj.mul()); 
        System.out.println(obj.mul(2.5, 3)); 
        System.out.println(obj.mul(9999,(long)5555));
        //SUMA
        System.out.println(obj.sum());
        System.out.println(obj.sum(2.5, 3));
        System.out.println(obj.sum(9999, (long)5555));
        //RESTA
        System.out.println(obj.res());
        System.out.println(obj.res(2.5, 3));
        System.out.println(obj.res(9999, (long)5555));
        //RAIZ
        System.out.println(obj.raiz(27));
        System.out.println(obj.raiz(25));
        //POTENCIA
        System.out.println(obj.potencia(3.5, 2));
        System.out.println(obj.potencia(4, 3));
    }
    
}
