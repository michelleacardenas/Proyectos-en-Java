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
public class Colas implements Machote
{

    public Object[] cola;
    public int atras = -1;

    public Colas(int n)
    {
        cola = new Object[n];
    }

    public Object[] getCola()
    {
        return cola;
    }

    public void setCola(Object[] cola)
    {
        this.cola = cola;
    }

    public int getAtras()
    {
        return atras;
    }

    public void setAtras(int atras)
    {
        this.atras = atras;
    }

    @Override
    public boolean llena()
    {
        return atras == cola.length - 1;
    }

    @Override
    public boolean vacia()
    {
        return atras == -1;
    }

    @Override
    public void inserta(Object obj)
    {
        if (!llena())
        {
            cola[++atras] = obj;
        } else
        {
            System.out.println("Cola llena");
        }
    }

    @Override
    public Object elimina()       //no hay pila auxiliar es sobre la misma cola.          Para sacar la ultima posicion debemos
    {
        Object o = null;

        if (!vacia())
        {
            o = cola[0];
            for (int i = 0; i < atras; i++)
            {
                cola[i] = cola[i + 1];
            }

            atras--;     //
        } else
        {
            System.out.println("Cola vacía");
        }
        return o; //puede ser 0 si esta vacia o el dato que se elimina
    }
     

}
