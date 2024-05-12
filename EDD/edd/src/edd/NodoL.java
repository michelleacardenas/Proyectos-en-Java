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
public class NodoL <T>
{
    private String etiqueta;
    private T obj;
    private NodoL siguiente; //todos los apuntadores se inicializan en nulo       //apuntador q permite conectar con otros nodos
    private NodoL anterior;
    private NodoL abajo;
    
    public NodoL()
    {
    }

    public NodoL(String etiqueta, T obj)
    {
        this.etiqueta = etiqueta;
        this.obj = obj;
    }

    /**
     * @return the etiqueta
     */
    public String getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the siguiente
     */
    public NodoL getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoL siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoL getAnterior()
    {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoL anterior)
    {
        this.anterior = anterior;
    }

    /**
     * @return the abajo
     */
    public NodoL getAbajo()
    {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoL abajo)
    {
        this.abajo = abajo;
    }
    
    
}
