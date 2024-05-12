/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *  @version 1.0 
 * @author marip
 * ESTA CLASE ES PARA HACER OPERACIONES BASICAS
 */
public class Operaciones
{
    private int a;
    private int b;

    /**
     * CONSTRUCTOR POR DEFECTO PARA ASIGNAR VALORES POR DEFECTO A LAS PROPIEDADES a & b
     * @param a
     * @param b 
     */
    
    public Operaciones(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    /**Constructor vacio
     * 
     */
    public Operaciones()
    {
    }
    
    /**
     * METODO QUE DESPLIEGA TODO
     * @return 
     */
    public String desp()
    {
        return
                "a="+getA()+"\n"+
                "b="+getB()+"\n";
    }

    /**
     * @return the a
     */
    public int getA()
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a)
    {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB()
    {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b)
    {
        this.b = b;
    }
    
    /**
     * METODO QUE DIVIDE 2 ENTEROS Y REALIZA CAST PARA RETORNAR DOUBLE
     * @return un double
     */
    public double div()
    {
        if (b!=0)
        {
             return (double)a/b; //div propiedades
         //CAST  a/(double)b;
        }
        System.out.println("ERROR... No se puede dividir entre 0");
        return 0;
    }                      
   
    /**
     * METODO QUE DIVIDE DOS ENTEROS
     * @param a
     * @param b
     * @return 
     */
    public double div(int a, int b)
    {
        if (b!=0)
        {
           return (double)a/b;     //divide variables 
        }
        System.out.println("ERROR... No se puede dividir entre 0");
        return 0;
    }
    
    /**
     * METODO QUE DIVIDE UN DOUBLE Y UN ENTERO
     * @param a
     * @param b
     * @return 
     */
    public double div(double a, int b)
    {
         if (b!=0)
        {
           return (double)a/b;     
        }
        System.out.println("ERROR... No se puede dividir entre 0");
        return 0;
    }
    
    /**
     * METODO QUE DIVIDE UNENTERO Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double div(int a, double b)
    {
        if (b!=0)
        {
           return (double)a/b;     //divide variables 
        }
        System.out.println("ERROR... No se puede dividir entre 0");
        return 0;
    }
    /**
     * METODO QUE DIVIDE UN ENTERO Y UN LONG
     * @param a
     * @param b
     * @return 
     */
    public long div(int a, long b)
    {
        if (b!=0)
        {
           return (long)a/b;     //divide variables 
        }
        System.out.println("ERROR... No se puede dividir entre 0");
        return 0;
    }
    /**
     * METODO QUE DIVIDE UN DOUBLE Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double div(double a, double b)
    {
         if (b!=0)
        {
           return (double)a/b;     //divide variables 
        }
        System.out.println("ERROR... No se puede dividir entre 0");
        return 0;
    }
    
    
    public double sum()
    {
        return a+b; 
    }                       
   
    /**
     * METODO QUE SUMA DOS ENTEROS
     * @param a
     * @param b
     * @return 
     */
    public int sum(int a, int b)
    {
        return a+b;     
    }
    
    /**
     * METODO QUE SUMA UN DOUBLE Y UN ENTERO
     * @param a
     * @param b
     * @return 
     */
    public double sum(double a, int b)
    {
        return a+b;
    }
    
    /**
     * METODO QUE SUMA UN ENTERO Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double sum(int a, double b)
    {
        return a+b;
    }
    /**
     * METODO QUE SUMA UN ENTERO Y UN LONG
     * @param a
     * @param b
     * @return 
     */
    public long sum(int a, long b)
    {
        return a+b;
    }
    /**
     * METODO QUE SUMA UN DOUBLE Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double sum(double a, double b)
    {
        return a+b;
    }
    
    /**
     * METODO QUE RESTA DOS ENTEROS sin parametros
     * @return 
     */
    public double res()
    {
        return a-b; 
    }                       
   
    /**
     * METODO QUE resta DOS ENTEROS
     * @param a
     * @param b
     * @return 
     */
    public int res(int a, int b)
    {
        return a-b;     
    }
    
    /**
     * METODO QUE RESTA UN DOUBLE Y UN ENTERO
     * @param a
     * @param b
     * @return 
     */
    public double res(double a, int b)
    {
        return a-b;
    }
    
    /**
     * METODO QUE resta UN ENTERO Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double res(int a, double b)
    {
        return a-b;
    }
    /**
     * METODO QUE resta UN ENTERO Y UN LONG
     * @param a
     * @param b
     * @return 
     */
    public long res(int a, long b)
    {
        return a-b;
    }
    /**
     * METODO QUE RESTA UN DOUBLE Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double res(double a, double b)
    {
        return a-b;
    }

     /**
     * METODO QUE multiplicar DOS ENTEROS sin parametros 
     * @return 
     */
    public double mul()
    {
        return a*b; 
    }                       
   
    /**
     * METODO QUE multiplica DOS ENTEROS
     * @param a
     * @param b
     * @return 
     */
    public int mul(int a, int b)
    {
        return a*b;     
    }
    
    /**
     * METODO QUE multiplica UN DOUBLE Y UN ENTERO 
     * @param a
     * @param b
     * @return 
     */
    public double mul(double a, int b)
    {
        return a*b;
    }
    
    /**
     * METODO QUE multiplica UN ENTERO Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double mul(int a, double b)
    {
        return a*b;
    }
    /**
     * METODO QUE multiplica UN ENTERO Y UN LONG
     * @param a
     * @param b
     * @return 
     */
    public long mul(int a, long b)
    {
        return a*b;
    }
   /**
     * METODO QUE MULTIPLICA UN DOUBLE Y UN DOUBLE
     * @param a
     * @param b
     * @return 
     */
    public double mul(double a, double b)
    {
        return a/b;
    }
    /**
     * METODO PARA OBTENER RAIZ CUADRADA
     * @param a
     * @return double
     */
    
    public double raiz(double a)
    {
       
        if (a>=0)
        {
             return  (double)Math.sqrt(a);
        } else
        {
            System.out.println("ERROR... No existen raices imaginarias");
            return 0;
            
        }
    }
    /**
     * METODO PARA OBTENER RAIZ CUADRADA
     * @param a
     * @return 
     */
    public double raiz(int a)
    {
        
        if (a>=0)
        {
           return (double)Math.sqrt(a); 
        }
        System.out.println("ERROR... No existen raices imaginarias");
        return 0;
    }
    
    
    /**
     * METODO PARA OBTENER LA POTENCIA. SE OCUPAN a COMO BASE Y b COMO EXPONENTE
     * @param a
     * @param b
     * @return double
     */
    public double potencia(double a,double b)
    {
        return Math.pow(a, b);
    }
    /**
     * METODO PARA OBTENER LA POTENCIA. SE OCUPAN a COMO BASE Y b COMO EXPONENTE
     * @param a
     * @param b
     * @return int con cast
     */
    public int potencia(int a,int b)
    {
        return (int)Math.pow(a, b);
    }
    
    
}
