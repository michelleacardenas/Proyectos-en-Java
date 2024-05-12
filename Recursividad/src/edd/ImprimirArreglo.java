/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class ImprimirArreglo
{
    
    public static void imprimir(int arre[])
    {
        for (int i = 0; i < arre.length; i++)
        {
            System.out.println(arre[i]);
        }
    }
    
    
    
    public static void imprimirR(int i, int arre[], int f)
    {
        System.out.println("valor de entrada = "+i);
        if (i < arre.length)
        {
            System.out.println(arre[i]);
            f = arre[i];
            imprimirR(i+1, arre, f);
        } 
        System.out.println("valor de salida = "+i);
        System.out.println(f);
        
        
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int arre[] = {5,8,9,0,1};
        
        
        System.out.println("Forma iterativa:");
        imprimir(arre);
        
        System.out.println("Forma recursiva:");
        imprimirR(0, arre, 0);
//        imprimirRe(0, arre);
    }
    
}
