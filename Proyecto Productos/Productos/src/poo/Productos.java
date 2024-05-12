/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.Serializable;

/**
 *
 * @author marip
 */
public abstract class Productos implements Serializable//importar Ctrl shift i
{
    public final static long serialVersionUID=1L;//L para que sea long
    public final static double IVA=0.16;//Las constantes llevan puras mayuculas y son publicas
    private static int folio; 
    public  String id;
    private String nom;
    private double precio;
    private int existencias;

    public Productos()
    {
    }

    public Productos(String nom, double precio, int existencias)
    {
        ++folio; //cuando no esta en el constructor lo crea en nulo y con el ++ se va aumentando
        String s= String.valueOf(folio); //convierte entero a cadena (valueOf)
        for (int i = s.length(); i < 5; i++)
        {
            s="0"+s; //Agrega ceros a la izq
        }
        this.id = s;
        this.nom = nom;
        this.precio = precio;
        this.existencias = existencias;
    }
    public Productos(String nom, double precio, int existencias,String id)
    {
        ++folio; //cuando no esta en el constructor lo crea en nulo y con el ++ se va aumentando
        String s= String.valueOf(folio); //convierte entero a cadena (valueOf)
        for (int i = s.length(); i < 5; i++)
        {
            s="0"+s; //Agrega ceros a la izq
        }
        this.id = s;
        this.nom = nom;
        this.precio = precio;
        this.existencias = existencias;
    }

    /**
     * @return the folio
     */
    public static int getFolio()
    {
        return folio;
    }

    /**
     * @param aFolio the folio to set
     */
    public static void setFolio(int aFolio)
    {
        folio = aFolio;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the existencias
     */
    public int getExistencias()
    {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias)
    {
        this.existencias = existencias;
    }
    
 

    @Override //sobreposicion de metedos
    public String toString()
    {// "\t" da formato de tabla
        return  id + "\t" + nom + "\t"+ precio + "\t" + existencias ; 
    }
    
    public abstract double calIva(int cant,double precio);
    
    
}
