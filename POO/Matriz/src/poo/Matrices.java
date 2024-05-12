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
public class Matrices
{

    private int x[][];
    //Arreglos definidos por x
    public Matrices(int[][] x)
    {
        this.x = x;
    }

    public Matrices() //ARREGLO DE 5 POSICIONES
    {
        x = new int[5][5];
        Llena(); //Se llama pq es privado 
    }

    public Matrices(int n) //ARREGLO DE n POSICIONES
    {
        x = new int[n][n];
        Llena();
    }
    
    
    public String desp()
    {
        String s="";
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x.length; j++)
            {
              s+="Dato["+i+";"+j+"]="+x[i][j]+"\t";  //\t tabulador 
            }
            s+="\n";
        }
          return s;
    }
    
    /**
     * Desp for itch (no referencia la posición i) Tipo de for dif. 
     * Var es una variable.
     * for y se coloca el tipo de dato (int, char, String, etc...)
     * char var:arr
     * Los corchetes de VAR van decreciendo desde el primer for se le resta 1
     */
    public void despForItch()
    {
        for (int var[]:x)
        {
            for (int var2:var)
            {
            System.out.println("Dato="+var2+"\n");    
            }
            
        }
    }
    /**
     * @return the x
     */
    public int[][] getX()
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int[][] x)
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
            for (int j = 0; j < x.length; j++)
            {
                x[i][j]=(int)(Math.random()*100);
            }
            
        }
    }
    
    
}
