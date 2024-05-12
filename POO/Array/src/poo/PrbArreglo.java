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
public class PrbArreglo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { 
        
        Arreglo a;
        a = new Arreglo(3);   //si le coloco tamaño por ejemplo 3, solo toma tres posisiciones, pero si le pongo arr imprime el arreglo de arriba
        // aqui como "segundo" parametro ponemos los que queramos pq nos referimos al constructor no definido
        
        System.out.println(a.desp());
        System.out.println(a.getX()[2]=3);
        System.out.println(a.desp());
        
        
        
        int arr[] = {7, 3, 21, 14, 11, 12, 20, 35};   
        
        Arreglo b;
        b = new Arreglo(arr);   //si le coloco tamaño por ejemplo 3, solo toma tres posisiciones, pero si le pongo arr imprime el arreglo de arriba
        // aqui como "segundo" parametro ponemos los que queramos pq nos referimos al constructor no definido
        
        System.out.println(b.desp());

        
        

        
        Arreglo c;
        c = new Arreglo(true, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);   //si le coloco tamaño por ejemplo 3, solo toma tres posisiciones, pero si le pongo arr imprime el arreglo de arriba
        // aqui como "segundo" parametro ponemos los que queramos pq nos referimos al constructor no definido
        
        System.out.println(c.desp());
        
        
        
        
        
        
        Arreglo d;
        d = new Arreglo();
        // como es tipo void no va el sout porque no regresa nada
        d.DespForEach();
        
        
        Arreglo e;
        e = new Arreglo(true, 20,15,5,10,40,35);
        System.out.println(e.Burbuja(arr));

    }
    
}
