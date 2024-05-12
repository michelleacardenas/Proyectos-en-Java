/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author marip
 */
public class Multilista
{
    public NodoL inserta(NodoL r, int nivel, String s[], NodoL n) //se necesita r, el nivel de la lista, el arreglo y el nodo que se va a insertar
    {
        if (s.length - 1 == nivel)  //si ya llegué al nivel deseado donde se hará la inserción
        {
            ListasDoblementeLigada obj = new ListasDoblementeLigada();   //tecnico
            obj.setR(r);  //Colocamos r en el nivel que queremos
            obj.insertar(n);   //inserta el nodo
            return obj.getR();  //me lo regresa ya modificado
        } else
        {
            NodoL aux = busca(r, s[nivel]);
            if (aux!=null)  //si lo encontró
            {
                aux.setAbajo(inserta(aux.getAbajo(), nivel+1, s, n));  //recursión para no repetir lo de arriba
            }
            return r;
        }
        
    }
    
    
    public NodoL busca(NodoL r, String s)
    {
        ListasDoblementeLigada obj = new ListasDoblementeLigada();
        obj.setR(r);
        return obj.busca(s);
    }
    
    public void desp(NodoL r, String s)
    {
        while (r!=null)
        {            
            System.out.println(s + r.getEtiqueta());
            desp(r.getAbajo(), s+"\t");
            r = r.getSiguiente();
        }
    }
}
