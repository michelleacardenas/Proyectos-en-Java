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
public class PilaD 
{
    private Nodo tope;  // el tope es un apuntador a nodo, inicializado en null en lugar de -1 como eraa en pilas estaticas
    
    public void inserta(Nodo n)  //siempre se reciben nodos para conectar
    {
        if (n != null)
        {
            n.setSiguiente(tope);
            tope = n;
        }else
        {
            System.out.println("No se puede insertar (Pila llena)");
        }
    }
    
    public Nodo elimina()
    {
        Nodo n = null;
        if (tope != null)
        {
            n = tope;
            tope = n.getSiguiente();
            n.setSiguiente(null);
        }else
        {
            System.out.println("Pila vacia");
        }
        return n;
    }

    /**
     * @return the tope
     */
    public Nodo getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(Nodo tope)
    {
        this.tope = tope;
    }
    
    
}
