/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author LIPYM
 */
public class ArregloDinamico
{
   
    private int arre[];

    
    public String desp()
    {
        String s = "";
        if (arre != null)
        {
            for (int i = 0; i < getArre().length; i++)
            {
                s+= "Dato[" + i +"] = " + getArre()[i] + "\n";
            }
        } else
        {
            s+= "no hay datos";
        }
        return s;
    }
    
    
    //si arre está vacio se llena la primer posicion
    // arre es el arreglo base y arre2 es el nuevo arreglo
    
    public void inserta(int x)
    {
        if (arre == null)
        {
            arre = new int[1]; //reserva el espacio
            arre[0] = x;
        } else
        {
            int arre2[] = new int [arre.length+1];  //agrega una posicion mas
            System.arraycopy(arre, 0, arre2, 0, arre.length); //copio el viejo hacia el nuevo
            //primero va el arreglo origen de donde voy a tomar los datos para copiar, despues desde q posición quiero copiar, luego va el arrreglo destino e igual desde donde quiero empezar a llenar datos y por ultimo cuantos datos voy a mover
            
            arre2[arre.length] = x;  // mete el nuevo dato x al arre2
            
            arre = arre2;  //pasa el arre a arre2 y arre se borra
        }
    }

    
    
    
    
    //puedo eliminar una posicion o un dato de una posicion
    
    //elimina posicion
    public  void elimina(int p)
    {
        if (arre!=null) //si arre está vacio
        {
            if (p>=0 && p < arre.length) //si la posicion p es mayor o igual a 0 y es menor a la longitud del arreglo
            {
                if (p == 0 && arre.length == 1) //si la posicion p es igual a 0 y la longitud es igual a 1
                {
                    arre = null;  //entonces el arreglo está vacio
                } else
                {
                    int nuevo[] = new int [arre.length-1]; //de otra manera,
                    
                    for (int j = 0, i=0; i < arre.length; i++)  
                    {
                        if (i!=p)
                        {
                            nuevo[j++] = arre[i];
                        } 
                    }
                    arre = nuevo;
                }
            } else
            {
                System.out.println("Posición incorrecta");
            }
        } else
        {
            System.out.println("No hay datos");
        }
    }
    
    
    
    //elimina un dato de una posicion
    public  void eliminadato(int nombre, int d)
    {
        if (arre!=null) //si arre no está vacio
        {
            
            if (d == arre[0] && arre.length == 1) //si el dato está en la posicion 0 y la longitud es igual a 1
            {
                arre = null;  //entonces el arreglo está vacio
            } else
            {
                int nuevo[] = new int [arre.length-1]; //de otra manera,
                for (int j = 0, i=0; i < arre.length; i++)  
                {
                    if (arre[i]!=d)
                    {
                        nuevo[j++] = arre[i];
                    } 
                }
                arre = nuevo;
            }
        } else
        {
            System.out.println("No hay datos");
        }
    }
    
    
    
    
    
    
    
    
    
    /**
     * @return the arre
     */
    public int[] getArre()
    {
        return arre;
    }

    /**
     * @param arre the arre to set
     */
    public void setArre(int[] arre)
    {
        this.arre = arre;
    }
    
    
    
}
