/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class ListasDoblementeLigada
{

    private NodoL r = null;

    /**
     * @return the r
     */
    public NodoL getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoL r)
    {
        this.r = r;
    }

    public boolean insertar (NodoL n)
    {
        if (n == null)
        {
            return false;
            
        } else
        {
            if (r == null)
            {
                r=n;
            } else
            {
                if (n.getEtiqueta().compareTo(r.getEtiqueta())<0)
                {
                    n.setSiguiente(r);
                    r.setAnterior(n);
                    r = n;
                } else
                {
                    
                    NodoL aux = r;
                    boolean b = true;
                    while (aux.getSiguiente() != null && b)
                    {
                        if (n.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta())<0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            n.setAnterior(aux);
                            aux.getSiguiente().setAnterior(n);
                            aux.setSiguiente(n.getSiguiente().getAnterior());
                            b = false;
                        } else
                        {
                            aux = aux.getSiguiente();
                        }
                    }
                    if (b)  //esta en la ultima pos
                    {
                        aux.setSiguiente(n);
                        n.setAnterior(aux);
                    }
                }
            }
            return true;
        }
    }

    public NodoL eliminar(String etiqueta)
    {
        if (r == null)
        {
            return null;
        } else
        {
            NodoL aux = null;
            if (etiqueta.compareTo(r.getEtiqueta()) >= 0)
            {
                if (r.getEtiqueta().equals(etiqueta))
                {
                    aux = r;
                    r = aux.getSiguiente();  //r se mueve a la derecha
                    aux.setSiguiente(null);
                    r.setAnterior(null);
                } else
                {
                    NodoL aux2 = r;
                    boolean b = true;
                    while (aux2.getSiguiente() != null && b) //si no está al final de la lista
                    {
                        if (etiqueta.compareTo(aux2.getSiguiente().getEtiqueta()) >= 0)
                        {

                            if (aux2.getSiguiente().getEtiqueta().equals(etiqueta))
                            {
                                aux = aux2.getSiguiente();  //se localiza el dato a eliminar
                                
                                if (aux.getSiguiente()!= null)
                                {
                                    aux.getSiguiente().setAnterior(aux2);   //aux=n  y aux2=aux en cod mauro
                                }
                                
                                aux2.setSiguiente(aux.getSiguiente());
                                aux.setSiguiente(null);
                                b = false;
                            } else
                            {
                                aux2 = aux2.getSiguiente();
                            }
                        }else
                        {
                            break;      
                        }

                    }
                }

            }
            if (aux!=null)   //van a desaparecer las conexiones del dato eliminado         //es para corroborar q sea desconectado
            {
                aux.setSiguiente(null);
                aux.setAnterior(null);
            }
            return aux;
        }
    }

    public String desp(NodoL aux)
    {
        String s = "";

        while (aux != null)
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
        }

        return s;
    }
    
    
    public void despR(NodoL aux)
    {
        if (aux!=null)
        {
            System.out.println(aux.getEtiqueta());
            despR(aux.getSiguiente());
            System.out.println(aux.getEtiqueta());
            
        }
    }
    
    public NodoL busca(String s)
    {
        NodoL aux = r;
        while (aux!=null)
        {            
            if (aux.getEtiqueta().equals(s))
            {
                return aux;  //encontró el dato
            }
            aux = aux.getSiguiente();
        }
        return null;  //no encontró el dato
    }
    
    

}
