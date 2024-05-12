/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class PrbColaD
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ColaD co = new ColaD();
        
        Nodo <String> n1 = new Nodo<>("1", "Mexico");
        Nodo <String> n2 = new Nodo<>("2", "Canada");
        Nodo <String> n3 = new Nodo<>("3", "EUA");
        
        co.inserta(n1);
        co.inserta(n2);
        co.inserta(n3);
        
        Nodo de = co.elimina();
        System.out.println(de.getObj());
        de = co.elimina();
        System.out.println(de.getObj());
        de = co.elimina();
        System.out.println(de.getObj());
        de = co.elimina();
        System.out.println(de.getObj());
        
    }
    
}
