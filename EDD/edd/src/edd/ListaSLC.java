/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class ListaSLC
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
//q no sea nullo, cuando es el primero, cuando va antes del primero y al final de la lista, cuando va en medio
    
    //r está en la ultima pos. pq es mas facil asi acceder a la primera pos y  la ultima
    public boolean insertar (Nodo n)
    {
        if (n == null)
        {
            return false;
            
        } else  //si no es null
        {   //el primero en la lista
            if (r == null)
            {
                r=n;
                r.setSiguiente(r);
            } else
            {
                if (n.getEtiqueta().compareTo(r.getSiguiente().getEtiqueta())<=0 || n.getEtiqueta().compareTo(r.getEtiqueta())>=0) //cuando es el primero o es el ultimo
                {
                    n.setSiguiente(r.getSiguiente());
                    r.setSiguiente(n);
                    
                    if (n.getEtiqueta().compareTo(r.getEtiqueta())>=0)  //si el n q llega va despues de r se mueve r a n para q siga estando en la ultima pos
                    {
                        r = n;
                    }
                    
                } else    //va adentro
                {
                    Nodo aux = r;
                    while (true)  //cuando va en medio
                    {
                        if (n.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta())<0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            aux.setSiguiente(n);
                            break;
                        } else
                        {
                            aux = aux.getSiguiente();
                        }
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
            if (etiqueta.compareTo(r.getSiguiente().getEtiqueta()) >= 0 && etiqueta.compareTo(r.getEtiqueta()) <= 0)   //si el dato a eliminar está en el rango
            {
                if (r.getSiguiente().getEtiqueta().equals(etiqueta)) //si esta en la primer pos
                {
                    aux = r.getSiguiente();
                    r.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    
                    if (r==aux)  //si es el unico elemento de la lista
                    {
                        r=null;
                    }
                    
                } else   //si está en medio
                {
                    Nodo aux2 = r.getSiguiente();
                    while (true) 
                    {
                        if (etiqueta.compareTo(aux2.getSiguiente().getEtiqueta()) <= 0) //para eliminar el dato
                        {

                            if (aux2.getSiguiente().getEtiqueta().equals(etiqueta))
                            {
                                aux = aux2.getSiguiente();  
                                aux2.setSiguiente(aux.getSiguiente());
                                aux.setSiguiente(null);
                                
                                if (r==aux)
                                {
                                    r = aux2;
                                }
                                break;
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

        do
        {
            s += aux.getEtiqueta();
            aux = aux.getSiguiente();
        } while (aux != r.getSiguiente());

        return s;
    }
    
    
    public String despR(Nodo aux, String s)
    {
        if(aux.getSiguiente()!=r.getSiguiente())
        {
            System.out.println(aux.getEtiqueta());
            s+=aux.getEtiqueta();
            despR(aux.getSiguiente(), "");
            System.out.println(aux.getEtiqueta());  
        } else
        {
            System.out.println(aux.getEtiqueta());
        }
        return s;
    }

}
