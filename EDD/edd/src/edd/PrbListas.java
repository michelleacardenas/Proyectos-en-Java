/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class PrbListas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Listas ls = new Listas();
        
        Nodo n1 = new Nodo("1", null);
        Nodo n2 = new Nodo("2", null);
        Nodo n3 = new Nodo("3", null);
        Nodo n4 = new Nodo("4", null);
        
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        System.out.println(n4);
        
        ls.insertar(n1);
        System.out.println(ls.desp(ls.getR()));
        ls.insertar(n2);
        System.out.println(ls.desp(ls.getR()));
        ls.insertar(n3);
        System.out.println(ls.desp(ls.getR()));
        ls.insertar(n4);
        System.out.println(ls.desp(ls.getR()));
        
        System.out.println(ls.eliminar("3"));
        System.out.println(ls.desp(ls.getR()));
        System.out.println(ls.eliminar("1"));
        System.out.println(ls.desp(ls.getR()));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(ls.despR(ls.getR(), ""));


    }
    
}
