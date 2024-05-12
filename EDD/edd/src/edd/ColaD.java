/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class ColaD
{
    private Nodo atras;
    private Nodo frente;

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
    
    /**
     * @return the frente
     */
    public Nodo getFrente()
    {
        return frente;
    }

    /**
     * @param frente the frente to set
     */
    public void setFrente(Nodo frente)
    {
        this.frente = frente;
    }
    
    
    
    
    
    
    public void inserta(Nodo n)
    {
        if (n!=null)
        {
            if (frente==null)
            {
                frente=n;
            } else
            {
                atras.setSiguiente(n);   
            }
            atras=n;
        } else
        {
            System.out.println("No se puede insertar (cola llena)");
        }
    }
    
    public Nodo elimina()
    {
        Nodo ne = null;
        if (frente!=null)
        {
//            if  {
//                
//            }else   
//            {
//                
//            }
//              
//            
            ne = frente;
            frente = ne.getSiguiente(); 
            
        } else
        {
            if (frente==null) 
            {
                atras = null;
                System.out.println("No hay datos en la cola (Cola vacia)");
            }
            
        }
        return ne;
    }
    
    
    //Regla: en una inserción el que llega es el primero q se conecta, despues se reconectan o se reajustan las conexiones de los que estaban (apuntadores) 
    //Regla: primero se ubica el que se va a eliminar, se desconectan primero los que se quedan (apuntadores) y al final se desconecta el que se va

    
}
