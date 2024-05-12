/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author marip
 */
public class NoPerecederos extends Productos implements Machote
{
    private int lote;

    public NoPerecederos()
    {
    }

    public NoPerecederos(int lote, String nom, double precio, int existencias)
    {
        super(nom, precio, existencias);
        this.lote = lote;
    }
    
    public NoPerecederos(String id,int lote, String nom, double precio, int existencias)
    {
        super(nom, precio, existencias);
        this.lote = lote;
        this.id=id;
    }

    /**
     * @return the lote
     */
    public int getLote()
    {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(int lote)
    {
        this.lote = lote;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\t" + lote + "\n";
    }

    @Override
    public double calIva(int cant, double precio)
    {
        return (cant*precio)*Productos.IVA;
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
