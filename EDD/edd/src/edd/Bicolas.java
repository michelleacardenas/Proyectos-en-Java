/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LaSoEm-29
 */
public class Bicolas 
{
    private Object[] bc;
    private int atras = -1;
    private int a2;

    public Bicolas(int n)
    {
        bc = new Object[n];
        a2 = n;
    }
    
    
    /**
     * @return the a2
     */
    public int getA2()
    {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(int a2)
    {
        this.a2 = a2;
    }

    /**
     * @return the bc
     */
    public Object[] getBc()
    {
        return bc;
    }

    /**
     * @param bc the bc to set
     */
    public void setBc(Object[] bc)
    {
        this.bc = bc;
    }

    /**
     * @return the atras
     */
    public int getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(int atras)
    {
        this.atras = atras;
    }

    // EN EL Factor se coloca uno mas o uno menos dependiendo de quien sea a
    public int inserta(Object o, int a, int limite, int factor)   //los limites de cada uno es el opuesto          'factor' variable de control es para sumar o restar
    {
        if (a + factor != limite) //si no esta llena
        {
            getBc()[a+factor] = o;
            return a + factor;    //modifica el origen
        } else
        {
            System.out.println("Bicola llena");
            return a;
        }
    }
    

//    public Object[] elimina(int a, int limite, int factor)    //es arreglo porque regresa la nueva pos. de atras y el dato eliminados.  cosa que no se podría regresando solo un dato
//    {
//        Object []e = new Object[2];   //en la pos 1 es el dato eliminado y en la pos 2 va el nuevo atras
//        if (a != limite)   //si no está vacia
//        {
//            e[0] = getBc()[limite+factor];
//            for (int i = limite+factor; i != a; i+=factor)
//            {
//                getBc()[i]= getBc()[i+factor];   //recorre una pos. todos los datos, ya sea izq o der dependiendo el atras
//            }
//            getBc()[1] = a - factor;
//        } else
//        {
//            System.out.println("Bicola vacia");
//            getBc()[1] = a;
//        }
//        return e;
//    }
    
    
    
    public Object[] elimina(int a, int limite, int factor)    //es arreglo porque regresa la nueva pos. de atras y el dato eliminados.  cosa que no se podría regresando solo un dato
    {
        Object []arr = new Object[2];   //en la pos 1 es el dato eliminado y en la pos 2 va el nuevo atras
        if (a != limite)   //si no está vacia
        {
            arr[0] = getBc()[limite+factor];
            for (int i = limite+factor; i != a; i+=factor)
            {
                getBc()[i]= getBc()[i+factor];   //recorre una pos. todos los datos, ya sea izq o der dependiendo el atras
            }
            a-= factor;
        } else
        {
            System.out.println("Bicola vacia");
            getBc()[0] = null;
        }
        arr[1] = a;
        return arr;
    }

}
