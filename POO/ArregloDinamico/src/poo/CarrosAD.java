/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author marip
 */
public class CarrosAD
{
    private String arre[];
    
    
    
    public String desp()
    {
        String s = "";
        if (getArre() != null)
        {
            for (int i = 0; i < getArre().length; i++)
            {
                s+= "Carro[" + i +"] = " + getArre()[i] + "\n";
            }
        } else
        {
            s+= "no hay carros";
        }
        return s;
    }
    
    
    
    
    public void inserta(String marca)
    {
        if (arre == null)
        {
            arre = new String[1]; //reserva el espacio
            arre[0] = marca;
        } else
        {
            String arre2[] = new String [arre.length+1];  //agrega una posicion mas
            System.arraycopy(arre, 0, arre2, 0, arre.length); //copio el viejo hacia el nuevo
            //primero va el arreglo origen de donde voy a tomar los datos para copiar, despues desde q posición quiero copiar, luego va el arrreglo destino e igual desde donde quiero empezar a llenar datos y por ultimo cuantos datos voy a mover
            
            arre2[arre.length] = marca;  // mete el nuevo dato x al arre2
            
            arre = arre2;  //pasa el arre a arre2 y arre se borra
        }
    }
    
    
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
                    String nuevo[] = new String [arre.length-1]; //de otra manera,
                    
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
    public  void eliminadato(int n, String dato)
    {
        if (arre!=null) //si arre no está vacio
        {
            
            if (dato == arre[0] && arre.length == 1) //si el dato está en la posicion 0 y la longitud es igual a 1
            {
                arre = null;  //entonces el arreglo está vacio
            } else
            {
                String nuevo[] = new String [arre.length-1]; //de otra manera,
                for (int j = 0, i=0; i < arre.length; i++)  
                {
                    if (arre[i] != dato)
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
    public String[] getArre()
    {
        return arre;
    }

    /**
     * @param arre the arre to set
     */
    public void setArre(String[] arre)
    {
        this.arre = arre;
    }
    
    
}
