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
public class PrbListaSLC
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaSLC ls = new ListaSLC();
        
        Nodo n1 = new Nodo("7", null);
        Nodo n2 = new Nodo("8", null);
        Nodo n3 = new Nodo("1", null);
        Nodo n4 = new Nodo("6", null);
        
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
        
        System.out.println(ls.eliminar("4"));  //regresa null porque no existe
        System.out.println(ls.desp(ls.getR().getSiguiente()));
        System.out.println(ls.eliminar("8"));
        System.out.println(ls.desp(ls.getR().getSiguiente()));
//        System.out.println(ls.eliminar("7"));
//        System.out.println(ls.desp(ls.getR().getSiguiente()));
//        System.out.println(ls.eliminar("1"));
//        System.out.println(ls.desp(ls.getR().getSiguiente()));
//        System.out.println(ls.eliminar("8"));
//        System.out.println(ls.getR()); //al ser el ultimo dato eliminado no se puede obtener el sig de null por lo que se imprime asi que la lista está vacia
        
//        System.out.println("Recursivo");
//        ls.despR(ls.getR().getSiguiente(), "");

        
    }
    
}
