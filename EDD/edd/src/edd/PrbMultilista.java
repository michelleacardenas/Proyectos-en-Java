/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class PrbMultilista
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Multilista ml = new Multilista();
        NodoL r = null;

        NodoL p1 = new NodoL("Mexico", null);
        NodoL p2 = new NodoL("Alemania", null);
        NodoL p3 = new NodoL("Grecia", null);
        NodoL p4 = new NodoL("Colombia", null);

        NodoL e1 = new NodoL("CDMX", null);
        NodoL e2 = new NodoL("Berlin", null);
        NodoL e3 = new NodoL("Atenas", null);
        NodoL e4 = new NodoL("Medellin", null);

        NodoL esc1 = new NodoL("Argos", null);
        NodoL esc2 = new NodoL("Niños Heroes", null);
        NodoL esc3 = new NodoL("Justo sierra", null);
        NodoL esc4 = new NodoL("ABC", null);

        String arr[] = new String[1];
        arr[0] = "Mexico";
        r = ml.inserta(r, 0, arr, p1);
        arr[0] = "Alemania";
        r = ml.inserta(r, 0, arr, p2);
        arr[0] = "Grecia";
        r = ml.inserta(r, 0, arr, p3);
        arr[0] = "Colombia";
        r = ml.inserta(r, 0, arr, p4);

        String arr2[] = new String[2];
        arr2[0] = "Mexico";
        arr2[1] = "CDMX";
        r = ml.inserta(r, 0, arr2, e1);
        arr2[0] = "Alemania";
        arr2[1] = "Berlin";
        r = ml.inserta(r, 0, arr2, e2);
        arr2[0] = "Grecia";
        arr2[1] = "Atenas";
        r = ml.inserta(r, 0, arr2, e3);
        arr2[0] = "Colombia";
        arr2[1] = "Medellin";
        r = ml.inserta(r, 0, arr2, e4);

        String arr3[] = new String[3];
        arr3[0] = "Mexico";
        arr3[1] = "CDMX";
        r = ml.inserta(r, 0, arr3, esc1);
        r = ml.inserta(r, 0, arr3, esc2);
        r = ml.inserta(r, 0, arr3, esc3);
//        arr3[0] = "Alemania";
//        arr3[1] = "Berlin";
//        r = ml.inserta(r, 0, arr3, esc4);
//        
//        arr3[0] = "Grecia";
//        arr3[1] = "Atenas";
//        arr3[2] = "Justo Sierra";
//        
        arr3[0] = "Colombia";
        arr3[1] = "Medellin";
        r=ml.inserta(r, 0, arr3, esc4);

        ml.desp(r, "");

    }

}
