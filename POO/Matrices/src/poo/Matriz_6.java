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
public class Matriz_6
{

    
    private int x[][][][][][];

    
    public Matriz_6()
    {
        x = new int[5][5][5][5][5][5];
        Llena();
    }

    
    public Matriz_6(int[][][][][][] x)
    {
        this.x = x;
    }
    
    
    public Matriz_6(int n, int m, int o, int p, int q, int r)
    {

        x = new int [n][m][o][p][q][r];
        Llena();
    }
    
    
    
    
    
    public String desp()
    {
        String s = "";
        for (int i = 0; i < getX().length; i++)
        {
            for (int j = 0; j < getX().length; j++)
            {
                for (int k = 0; k < getX().length; k++)
                {
                    for (int l = 0; l < getX().length; l++)
                    {
                        for (int u = 0; u < getX().length; u++)
                        {
                            for (int v = 0; v < getX().length; v++)
                            {
                                s+= "Dato[" + i +"," + j +"," + k + "," + l + "," + u + "," + v +"] = " + getX()[i][j][k][l][u][v] + "\t";
                            }
                        }
                    }
                }
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
                for (int k = 0; k < getX().length; k++)
                {
                    for (int l = 0; l < getX().length; l++)
                    {
                        for (int u = 0; u < getX().length; u++)
                        {
                            for (int v = 0; v < getX().length; v++)
                            {
                                getX()[i][j][k][l][u][v]= (int) (Math.random()*100);
                            }
                        }
                    }
                }
            }
            
        }
    }
    
   
    
    
    /**
     * For each
     */
    public void DespForEach()
    {
        for (int var [][][][][]: getX())
        {
            for (int var2 [][][][]: var)
            {
                for (int var3 [][][] : var2)
                {
                    for (int var4 [][] : var3)
                    {
                        for (int var5 [] : var4)
                        {
                            for (int var6 : var5)
                            {
                                System.out.println("Dato= "+ var + ","+ var2 + ","+ var3 +","+ var4 +","+ var5 +","+ var6 +"\n");
                            }
                        }
                    }
                }
            }
            
        }
    }

    
    
    
    
    /**
     * GETTERS AND SETTERS
     * @return the x
     */
    public int[][][][][][] getX()
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int[][][][][][] x)
    {
        this.x = x;
    }
    
    
    
    
    
    
    
    
    
    
    
}
