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
public class Factorial
{

    public static void fact(int n)
    {
        System.out.println("**Forma iterativa**");
        
        int f = 1;
        for (int i = 1; i <= n; i++)
        {
            f = f * i;  //o puede ser f*=i;
        }

        System.out.println("El factorial es: " + f);
    }

    
    
    public static void factRec(int n, int f, int i)  //como f está dentro del ciclo se pasa como parametro y también la variable de control i
    {
        System.out.println("valor de entrada de 'i'=" + i);
        System.out.println("Valor que toma el factorial = " + f);
        if (i <= n)
        {
            f = f * i;  
            factRec(n, f, i+1);
        } else
        {
            System.out.println("El factorial es: " + f); //se mete en un else para que no se imprima todas las veces que cambia i o que estuvo pendiente la impresión sino solo una vez
        }

        System.out.println("valor de salida de 'i' de regreso = " + i);
        System.out.println("Valor que toma el factorial = " + f);
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("****Sacar el factorial de un número**** ");
        System.out.println("Escriba el número deseado: ");
        int n = Lecturas.leerEntero();

        fact(n);
        System.out.println("**Forma recursiva**");
        factRec(n, 1, 1);

        
        

    }
    
}
