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
public class Matriz6D
{

    private int x[][][][][][];
    //Arreglos definidos por x
    public Matriz6D(int[][][][][][] x)
    {
        this.x = x;
    }

    public Matriz6D() //ARREGLO DE 2 POSICIONES
    {
        x = new int[3][3][3][3][3][3];
        Llena(); //Se llama pq es privado 
    }

    public Matriz6D(int n) //ARREGLO DE n POSICIONES
    {
        x = new int[n][n][n][n][n][n];
        Llena();
    }
    
    
    public String desp()
    {
        String s="";
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x.length; j++)
            {
                for (int k = 0; k < x.length; k++)
                {
                    for (int l = 0; l < x.length; l++)
                    {
                        for (int m = 0; m < x.length; m++)
                        {
                            for (int n = 0; n < x.length; n++)
                            {
                                 s+="Dato["+i+";"+j+";"+k+";"+l+";"+m+";"+n+"]="+x[i][j][k][l][m][n]+"\t";  //\t tabulador 
                            }
                             s+="\n ";
                        }
                         s+="\n ";
                    }
                     s+="\n ";
                }
                 s+="\n ";
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
        for (int var[][][][][]:x)
        {
            for (int var2[][][][]:var)
            {
                for (int var3[][][]:var2)
                {
                    for (int var4[][]:var3)
                    {
                        for (int var5[]:var4)
                        {
                            for (int var6:var5)
                            {
                                System.out.println("Dtao="+var6+"\n");
                            }
                        }
                    }
                }
            }
            
        }
    }
    /**
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
    
    /**
     * Método que llena aleatoriamente el arreglo
     */
    private void Llena()
    {
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x.length; j++)
            {
                for (int k = 0; k < x.length; k++)
                {
                    for (int l = 0; l < x.length; l++)
                    {
                        for (int m = 0; m < x.length; m++)
                        {
                            for (int n = 0; n < x.length; n++)
                            {
                                 x[i][j][k][l][m][n]=(int)(Math.random()*100);
                            }
                        }
                    }
                }
            }
            
        }
    }
    
    
}
