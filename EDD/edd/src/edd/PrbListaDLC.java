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
public class PrbListaDLC
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaDLC ls = new ListaDLC();
        
        NodoL n1 = new NodoL("7", null);
        NodoL n2 = new NodoL("5", null);
        NodoL n3 = new NodoL("1", null);
        NodoL n4 = new NodoL("4", null);
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        
        ls.insertar(n1);
//        System.out.println(ls.desp(ls.getR().getSiguiente()));  //para que imprima el primero y no solo el ultimo que se agrega
        ls.insertar(n2);
//        System.out.println(ls.desp(ls.getR().getSiguiente()));
        ls.insertar(n3);
//        System.out.println(ls.desp(ls.getR().getSiguiente()));
        ls.insertar(n4);
        System.out.println(ls.desp(ls.getR().getSiguiente()));
        
        System.out.println(ls.eliminar("8"));  //regresa null porque no existe
        System.out.println(ls.despp(ls.getR()));  //regresa el ultimo dato el mio, pero el de mauro lo imprime completo
//        System.out.println(ls.eliminar("7"));
//        System.out.println(ls.desp(ls.getR().getSiguiente()));
//        System.out.println(ls.eliminar("5"));
//        System.out.println(ls.desp(ls.getR().getSiguiente()));
//        System.out.println(ls.eliminar("1"));
//        System.out.println(ls.desp(ls.getR().getSiguiente()));
        
        System.out.println("Recursivo");
        ls.despR(ls.getR().getSiguiente(), "");
//        ls.desppR(ls.getR().getSiguiente(),ls.getR());
    }
    
}
