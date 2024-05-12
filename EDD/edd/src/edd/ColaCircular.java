/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LaSoEm-29
 */
public class ColaCircular implements Machote
{
    public Object[] cola;
    public int atras = -1;
    public int frente = -1;

    
    public ColaCircular(int n)
    {
        cola = new Object[n];
    }

    public Object[] getPila()
    {
        return cola;
    }

    public void setPila(Object[] pila)
    {
        this.cola = pila;
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
        return (atras+1==frente || (atras == cola.length-1 && frente == 0));
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
            if (atras==-1)
            {
                atras = frente=0;
            } else
            {
                if (atras == cola.length-1)
                {
                    atras = 0;
                } else
                {
                    atras++;
                }
            }
            cola[atras] = obj;
        } else
        {
            System.out.println("Cola C. llena");
        }
    }
    
    
    
    //el frente es el que se elimina siempre
    @Override
    public Object elimina()       
    {
        Object o = null;

        if (!vacia())   
        {
            o = cola[frente];
            
            if (frente == atras)  //el ultimo objeto
            {
                frente = atras = -1;
            } else
            {
                if (frente == cola.length-1)  //si esta en el limite de la cola
                {
                    frente=0;
                } else
                {
                    frente++;
                }
            }
        } else
        {
            System.out.println("Cola C. vacía");
        }
        return o; //puede ser 0 o null si esta vacia o el dato que se elimina
        
        
        
        
        
        
        
        
        
        //PARA ORDNAR SAE USAN DOS COLAS 
    }
}
