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
public class ColaCircularD
{

    private Nodo atras;

    /**
     * @return the atras
     */
    public Nodo getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras)
    {
        this.atras = atras;
    }

    public void inserta(Nodo n)
    {
        if (n != null)
        {
            if (atras == null)
            {
                atras = n;
                atras.setSiguiente(atras);
            } else
            {
                n.setSiguiente(atras.getSiguiente());
                atras.setSiguiente(n);

            }
            atras = n;
        } else
        {
            System.out.println("No se puede insertar");
        }

    }

    public Nodo elimina()
    {
        Nodo n = null;
        if (atras != null)
        {
            n = atras.getSiguiente();
            
            if (atras== n)
            {
                n.setSiguiente(null);
                atras= null;
            } else
            {
                atras.setSiguiente(n.getSiguiente());
                n.setSiguiente(null);
            }

        } else
        {
            System.out.println("cola vacia");
        }
        return n;
    }
}
