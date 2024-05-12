/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

import poo.Lecturas;

/**
 *
 * @author marip
 */
public class Suma10
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("****Suma de números descendentemente**** ");
        System.out.println("Escriba el número deseado: ");
        int n = Lecturas.leerEntero();
        
        System.out.println("**Forma iterativa**");
        suma(n);
        
        System.out.println("**Forma recursiva**");
        sumaR(n, 0, 0);
        
        
    }
    
    
    
    public static void suma(int n)
    {
        int res = 0;
        
        for (int i = 0; i < n+1; i++)
        {
            res = res + i;
            System.out.println(res);
        }
        
        System.out.println("El resultado es: " + res);
    }
    
    
    
    public static void sumaR(int n, int res, int i)
    {
        System.out.println("valor de entrada=" + i);
        if (i < n+1)
        {
            res = res + i;
            System.out.println(res);
            sumaR(n, res, i+1);
        }
        System.out.println("valor de salida= "+ i);
        System.out.println("El resultado es: " + res);
    }
    
    
}
