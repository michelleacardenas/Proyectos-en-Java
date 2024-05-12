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
public class Arreglo
{

    
    private int x[];

    
    public Arreglo()
    {
        x = new int[5];
        Llena();
    }

    
    public Arreglo(int[] x)
    {
        this.x = x;
    }
    
    
    public Arreglo(int n)
    {

        x = new int [n];
        Llena();
    }
    
    
    
    
    /**
     * Arreglo no definido/conjunto de datos para crear un arreglo
     * @param b
     * @param x 
     */
    
        // el int ...x debe ser el ultimo parametro, jamas el primero o el de en medio
    public Arreglo (boolean b, int ...x)
    {
        this.x = x;
    }
    
    
    
    public String desp()
    {
        String s = "";
        for (int i = 0; i < x.length; i++)
        {
            s+= "Dato[" + i +"] = " + x[i] + "\n";
        }
        return s;
    }
    
    
    private void Llena()
    {
        for (int i = 0; i < x.length; i++)
        {
            x[i]= (int) (Math.random()*100);
        }
    }
    
    
    
    /**
     * metodo burbuja
     * @param x
     * @return 
     */
    
    public int[] Burbuja(int ...x)
    {
        int aux;
        for (int i = 0; i < (x.length - 1); i++)
        {
            for (int j = 0; j < (x.length - 1); j++)
            {
                if (x[j] > x[j+1])
                {
                    aux = x[j];
                    x[j] = x[j+1];
                    x[j+1]=aux;
                }
            }
        }
        return x;
    }
    
    
    /**
     * For each
     */
    public void DespForEach()
    {
        for (int var : x)
        {
            System.out.println("Dato= "+ var + "\n");
        }
    }
    
    
    
    
    
    
    
    
    

    /**
     * @return the x
     */
    public int[] getX()
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int[] x)
    {
        this.x = x;
    }
    
    
    
}
