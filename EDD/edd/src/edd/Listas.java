/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class Listas
{

    private Nodo r = null;

    /**
     * @return the r
     */
    public Nodo getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r)
    {
        this.r = r;
    }

    public boolean insertar (Nodo n)
    {
        if (n == null)
        {
            return false;
            
        } else
        {
            if (r == null)
            {
                r=n; //si la lista está vacia raquel va a toomar el datos del nodo
            } else
            {   //  si el n q llega va antes de r
                if (n.getEtiqueta().compareTo(r.getEtiqueta())<0)   //si el primer dato es menor q el otro va a arrojar un -1, si es igual es 0 y si esmayor es 1
                {
                    n.setSiguiente(r);
                    r = n;  //r se mueve hacia la izq.      //asi se mueve a r
                } else
                {
                    
                    Nodo aux = r;  //usamos un aux para mover digamos a r
                    boolean b = true;  //si se encuentra una pos entre dos nodos va a ser falsa
                    while (aux.getSiguiente() != null && b)  //si hay null en LSL     //SE RECORRE LA LISTA
                    {
                        if (n.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta())<0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            aux.setSiguiente(n);
                            b = false;   //encontro una pos
                        } else
                        {
                            aux = aux.getSiguiente();  //se recorre el aux si no se cumple lo de arriba
                        }
                    }
                    if (b)   //si no encontró una pos
                    {
                        aux.setSiguiente(n);  //se coloca al final de la lista
                    }
                }
            }
            return true;
        }
    }

    public Nodo eliminar(String etiqueta)
    {
        if (r == null)
        {
            return null;
        } else
        {
            Nodo aux = null;
            if (etiqueta.compareTo(r.getEtiqueta()) >= 0)
            {
                if (r.getEtiqueta().equals(etiqueta))
                {
                    aux = r;  //le da el mismo valor
                    r = aux.getSiguiente();
                    aux.setSiguiente(null);
                } else
                {
                    Nodo aux2 = r;
                    boolean b = true;
                    while (aux2.getSiguiente() != null && b) //si no está al final de la lista
                    {
                        if (etiqueta.compareTo(aux2.getSiguiente().getEtiqueta()) >= 0)
                        {

                            if (aux2.getSiguiente().getEtiqueta().equals(etiqueta))
                            {
                                aux = aux2.getSiguiente();  //se localiza el dato a eliminar
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
            return aux;
        }
    }

    public String desp(Nodo aux)
    {
        String s = "";

        while (aux != null)
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
        }

        return s;
    }
    
    
    public String despR(Nodo aux, String s)
    {
//        System.out.println("ve= " + s);
        while (aux!=null)
        {
            System.out.println("ve= " + s);
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
            despR(aux, s);
        }
        System.out.println("vs= " + s);
        return s;
    }

}
