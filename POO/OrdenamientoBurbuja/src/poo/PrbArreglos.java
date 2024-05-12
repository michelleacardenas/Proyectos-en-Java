/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

//import java.util.HashSet;
//import java.util.Set;

/**
 *
 * @author marip
 */
public class PrbArreglos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //OTRA FORMA DE CREAR ARREGLOS new+datos
        int arr[]={7,3,21,14,111,12,20,35}; //Cada coma es una posición
                
        // TODO code application logic here
       // Arreglos obj= new Arreglos(); //INSTANCIAR
         Arreglos obj= new Arreglos(arr); // dentro de parentesis dejar vacio; poner arr o dar datos
        //Arreglos obj= new Arreglos(true,55,10,5,30,25,40,35,20,45,50,15); // NO DEFINIDO
        //System.out.println(obj.desp()); //dentro del desp poner 10 o el numero q quiera para constructor con n
        
        
        //x está encapsulado
        obj.getX()[2]=3; //OBTENER dirección de x en posicion 2
        System.out.println(obj.desp());
        
        
        //Método burbuja
        //2 for anidados
        int aux, numE=8;
        for (int i = 0; i <numE-1; i++)//i menor al numero de elementos menos 1
        {
            for (int j = 0; j <numE-1; j++)
            {
                if (arr[j]>arr[j+1])//Si num actual > numSig
                {
                   aux=arr[j]; //aux== num actual
                   arr[j]=arr[j+1];//num actual agregar valor de num sig
                   arr[j+1]=aux; //num sig == valor dentro de aux
                }
            }
        }
         
        System.out.println("ARREGLO ORDENADO \n"+obj.desp());
        
        System.out.println("ARREGLO ORDENADO de forma decreciente");
        for (int i =numE-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
        
        //Es void no regresa nada, se llama directamente sin el SOUT
        obj.despForItch();
       
    }
    
}
