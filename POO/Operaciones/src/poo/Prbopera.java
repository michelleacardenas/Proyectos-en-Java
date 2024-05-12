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
public class Prbopera
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Operaciones obj = new Operaciones(5, 2);
        int x= 5 + 2; //se declara x
        System.out.println(x);
        System.out.println((5 + 2)); //RESUMIR IMPRESION usar doble paréntesis
        System.out.println(5+2);
        //se usa get para acceder pq están encapsuladas
        x= obj.getA()+obj.getB(); //AMBITO: ya esta declarada la x ya no colocar "int" 
        
        Operaciones obj2 = new Operaciones(7, 7);
        x=obj.getA()+obj2.getB(); //obj + obj2 (5+7) EXTRAER VALORES DE 2 OBJ DIF Y SUMANDO
        System.out.println(x); 
        
        System.out.println(obj.sum());  //INVOCAR METODO SUMA con valores de obj
        System.out.println(obj2.sum()); //valores de obj2
        System.out.println(obj.sum(obj.getA(), obj2.getA())); //metodo SUMA accediendo a valores de obj y obj2}
        
        //division
        //x=obj.div(obj.getA(),obj2.getA());
        //System.out.println(x);
        
        double xxx=obj.sum(5, obj.mul(2,3)); //(5+2*3) primero se coloca la ultima operaciona resolver
        System.out.println(xxx);
        
        xxx=obj.potencia(obj.res(obj.getA(),obj.mul(3,obj.getB())), 3);
        System.out.println(xxx);
        
        //CAST PARA RESULTADO CORRECTO (llamaba a enteros el div y pasar a double)
        xxx=obj.potencia(obj.div(obj.mul(obj.sum(3, 5), obj.res(4, 3)), obj.mul(7, 3)), 2);
        System.out.println(xxx);
        
        xxx=obj.raiz(obj.res(obj.getA(),35));//RAIZ IMAGINARIA if o if else en metodo raiz
        System.out.println(xxx);
        
        
        //IF dividir entre 0
        double d=obj.div(4.5, 0);
        System.out.println(d);
        
        
        //C
        double c= obj.raiz(obj.sum(obj.potencia(obj.getA(), 2), obj.potencia(obj.getB(), 2)));
        System.out.println("C="+c);
        
        //FÓRMULA GENERAL
        double x1=obj.div(obj.sum(-obj.getB(), obj.raiz(obj.res(obj.potencia(obj.getB(), 2), obj.mul(obj.mul(4, obj.getA()), c)))), obj.mul(obj.getA(), 2));
        System.out.println("x1="+x1);
        
        double x2=obj.div(obj.res(-obj.getB(), obj.raiz(obj.res(obj.potencia(obj.getB(), 2), obj.mul(obj.mul(4, obj.getA()), c)))), obj.mul(obj.getA(), 2));
        System.out.println("x2="+x2);
        
    }
}
