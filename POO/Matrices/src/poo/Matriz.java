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
public class Matriz
{

    
    private int x[][];

    
    public Matriz()
    {
        x = new int[5][5];
        Llena();
    }

    
    public Matriz(int[][] x)
    {
        this.x = x;
    }
    
    
    public Matriz(int n, int m)
    {

        x = new int [n][m];
        Llena();
    }
    
    
    
    
    
    public String desp()
    {
        String s = "";
        for (int i = 0; i < getX().length; i++)
        {
            for (int j = 0; j < getX().length; j++)
            {
                s+= "Dato[" + i +"," + j +"] = " + getX()[i][j] + "\t";
            }
        }
        s+="\n";
        return s;
    }
    
    
    private void Llena()
    {
        for (int i = 0; i < getX().length; i++)
        {
            for (int j = 0; j < getX().length; j++)
            {
                getX()[i][j]= (int) (Math.random()*100);
            }
            
        }
    }
    
   
    
    
    /**
     * For each
     */
    public void DespForEach()
    {
        for (int var []: getX())
        {
            for (int var2 : var)
            {
                System.out.println("Dato= "+ var + ","+ var2 + "\n");
            }
            
        }
    }

    
    
    
    
    
    
    /**
     * GETTERS AND SETTERS
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
    
    
    
    
    
    
    
    
    
    
    
}
