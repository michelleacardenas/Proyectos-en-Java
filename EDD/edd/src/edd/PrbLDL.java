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
public class PrbLDL
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListasDoblementeLigada ls = new ListasDoblementeLigada();

        NodoL n1 = new NodoL("z", null);
        NodoL n2 = new NodoL("t", null);
        NodoL n3 = new NodoL("a", null);
        NodoL n4 = new NodoL("w", null);
        NodoL n5 = new NodoL("r", null);
        NodoL n6 = new NodoL("b", null);

        
        
        ls.insertar(n1);
//        ls.despR(ls.getR());
        ls.insertar(n2);
//        ls.despR(ls.getR());
        ls.insertar(n3);
//        ls.despR(ls.getR());
        ls.insertar(n4);
//        ls.despR(ls.getR());
        ls.insertar(n5);
//        ls.despR(ls.getR());
        ls.insertar(n6);
        ls.despR(ls.getR());


        

    }

}
