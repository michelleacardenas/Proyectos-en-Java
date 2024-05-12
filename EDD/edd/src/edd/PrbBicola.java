/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class PrbBicola
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("***Bicola de la palabra 'Mexico'***");
        
        Bicolas bc = new Bicolas(6);
        
        bc.setAtras(bc.inserta('M', bc.getAtras(), bc.getA2(), 1));
        bc.setA2(bc.inserta('e', bc.getA2(), bc.getAtras(), -1));
        bc.setAtras(bc.inserta('x', bc.getAtras(), bc.getA2(), 1));
        bc.setA2(bc.inserta('i', bc.getA2(), bc.getAtras(), -1));
        bc.setAtras(bc.inserta('c', bc.getAtras(), bc.getA2(), 1));
        bc.setA2(bc.inserta('o', bc.getA2(), bc.getAtras(), -1));
        System.out.println("");
        
        
        
        //para eliminar
        Object []arr = bc.elimina(bc.getA2(), bc.getBc().length, -1);  //el factor del lado izq es 1 y del der. es -1
        bc.setA2((int) arr[1]);  //Nueva pos de atras
        System.out.println("DE = " + arr[0]);  //dato eliminado
        
        arr = bc.elimina(bc.getAtras(), -1, 1);
        bc.setAtras((int) arr[1]);
        System.out.println("DE = " + arr[0]);
    }
    
}
