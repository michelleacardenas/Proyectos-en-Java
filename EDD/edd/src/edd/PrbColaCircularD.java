/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LSE
 */
public class PrbColaCircularD
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ColaCircularD co = new ColaCircularD();
        
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
        System.out.println(co.elimina());
    }
    
}
