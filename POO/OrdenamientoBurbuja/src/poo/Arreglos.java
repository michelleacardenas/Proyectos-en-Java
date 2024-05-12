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
public class Arreglos
{

    private int x[];
    //Arreglos definidos por x
    public Arreglos(int[] x)
    {
        this.x = x;
    }

    public Arreglos() //ARREGLO DE 1 POSICION
    {
        x = new int[1];
        
    }

    public Arreglos(int n) //ARREGLO DE n POSICIONES
    {
        x = new int[n];
        Llena();
    }
    
    //Arreglo no definido (SOLO 1 VAN AL FINAL DE LA LISTA DE PARAMETROS) 
    public Arreglos( boolean b,int ...x) //...x lo que sea 1 o mil 
    {
        this.x=x;
        
    }
    
    public String desp()
    {
        String s="";
        for (int i = 0; i < x.length; i++)
        {
            s+="Dato["+i+"]="+x[i]+"\n";
        }
          return s;
    }
    
    /**
     * Desp for itch (no referencia la posición i) Tipo de for dif. 
     * Var es una variable.
     * for y se coloca el tipo de dato (int, char, String, etc...)
     * char var:arr
     */
    public void despForItch()
    {
        for (int var:x)
        {
            System.out.println("Dato="+var+"\n");
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
    
    /**
     * Método que llena aleatoriamente el arreglo
     */
    private void Llena()
    {
        for (int i = 0; i < x.length; i++)
        {
            x[i]=(int)(Math.random()*100);
        }
    }
    
    
}
