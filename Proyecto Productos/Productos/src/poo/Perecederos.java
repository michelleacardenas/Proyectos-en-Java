/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author marip
 */
public class Perecederos extends Productos implements Machote//Hereda de productos
{

    private String fechaCad;

    public Perecederos()
    {
    }

    public Perecederos(String fechaCad, String nom, double precio, int existencias)
    {
        super(nom, precio, existencias);
        this.fechaCad = fechaCad;
    }
    
    public Perecederos (String id,String fechaCad, String nom, double precio, int existencias)
    {
        super(nom, precio, existencias);
        this.fechaCad = fechaCad;
        this.id=id;
    }

    /**
     * @return the fechaCad
     */
    public String getFechaCad()
    {
        return fechaCad;
    }

    /**
     * @param fechaCad the fechaCad to set
     */
    public void setFechaCad(String fechaCad)
    {
        this.fechaCad = fechaCad;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\t" + fechaCad + '\n';
    }

    @Override
    public double calIva(int cant, double precio)
    {
        return 0;
    }

    @Override
    public void accion1()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int accion2(int x)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String accion3(int x, double y, Object z)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
