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
public class PrbFiguras
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Figuras obj = new Figuras();
        System.out.println("LINEA");
        System.out.println(obj.linea(4, '*'));

        System.out.println("CUADRO");
        System.out.println(obj.cuadro(4, '*'));

        System.out.println("TRIANGULO INFERIOR IZQUIERDO");
        System.out.println(obj.tii(4, '*'));

        System.out.println("TRIANGULO SUPERIOR IZQUIERDO");
        System.out.println(obj.tsi(4, '*'));

        System.out.println("TRIANGULO SUPERIOR DERECHO");
        System.out.println(obj.tsd(4, '*'));

        System.out.println("TRIANGULO INFERIOR DERECHO");
        System.out.println(obj.tid(4, '*'));

        System.out.println("ROMBO");
        System.out.println(obj.rombo(7, '*'));

        System.out.println("ROMBO CON MARGEN");
        System.out.println(obj.RomboMargen(7, '*'));

        System.out.println("RELOJ DE ARENA");
        System.out.println(obj.reloj_arena(7, '*'));

        System.out.println("CRUZ");
        System.out.println(obj.cruz1(3, '*'));

        System.out.println("CRUZ");
        System.out.println(obj.cruz2(3, '*'));

        System.out.println("TELEVISA");
        System.out.println(obj.televisa(4, '¬'));

        System.out.println("CUADRO do");
        System.out.println(obj.cuadroD(4, '*'));

        System.out.println("CUADRO while");
        System.out.println(obj.cuadroW(4, '*'));

        System.out.println("LINEA do");
        System.out.println(obj.lineaD(4, '*'));

        System.out.println("LINEA while");
        System.out.println(obj.lineaW(4, '*'));

        System.out.println("TRIANGULO INFERIOR IZQUIERDO do");
        System.out.println(obj.tiiD(4, '*'));

        System.out.println("TRIANGULO INFERIOR IZQUIERDO while");
        System.out.println(obj.tiiW(4, '*'));

        System.out.println("TRIANGULO SUPERIOR IZQUIERDO do");
        System.out.println(obj.tsiD(4, '*'));

        System.out.println("TRIANGULO SUPERIOR IZQUIERDO while");
        System.out.println(obj.tsiW(4, '*'));

        System.out.println("TRIANGULO SUPERIOR DERECHO do");
        System.out.println(obj.tsdD(4, '*'));

        System.out.println("TRIANGULO SUPERIOR DERECHO while");
        System.out.println(obj.tsdW(4, '*'));

        System.out.println("TRIANGULO INFERIOR DERECHO do");
        System.out.println(obj.tidD(4, '*'));

        System.out.println("TRIANGULO INFERIOR DERECHO while");
        System.out.println(obj.tidW(4, '*'));

        System.out.println("ROMBO do");
        System.out.println(obj.romboDo(7, '*'));

        System.out.println("ROMBO while");
        System.out.println(obj.romboW(7, '*'));

        System.out.println("ROMBO MARGEN do");
        System.out.println(obj.romboDo(7, '*'));

        System.out.println("ROMBO MARGEN while");
        System.out.println(obj.romboW(7, '*'));

        System.out.println("RELOJ DE ARENA do");
        System.out.println(obj.RelojArenaDo(7, '*'));

        System.out.println("RELOJ DE ARENA while");
        System.out.println(obj.RelojArenaW(7, '*'));

        System.out.println("CRUZ 1 do");
        System.out.println(obj.Cruz1Do(3, '*'));

        System.out.println("CRUZ 1 while");
        System.out.println(obj.Cruz1W(3, '*'));

        System.out.println("CRUZ 2 do");
        System.out.println(obj.Cruz2Do(3, '*'));

        System.out.println("CRUZ 2 while");
        System.out.println(obj.Cruz2W(3, '*'));

        System.out.println("TELEVISA do");
        System.out.println(obj.TelevisaDo(6, '¬'));

        System.out.println("TELEVISA while");
        System.out.println(obj.TelevisaW(6, '¬'));

        System.out.println("CUADRO sin relleno");
        System.out.println(obj.cuadroSR(7, '*'));

        System.out.println("TRIANGULO INFERIOR IZQUIERDO sin relleno");
        System.out.println(obj.tiiSR(7, '*'));

        System.out.println("TRIANGULO SUPERIOR IZQUIERDO sin relleno");
        System.out.println(obj.tsiSR(7, '*'));

        System.out.println("TRIANGULO SUPERIOR DERECHO sin relleno");
        System.out.println(obj.tsdSR(7, '*'));

        System.out.println("TRIANGULO INFERIOR DERECHO sin relleno");
        System.out.println(obj.tidSR(7, '*'));

        System.out.println("ROMBO sin relleno");
        System.out.println(obj.romboSR(7, '*'));

        System.out.println("RELOJ DE ARENA sin relleno");
        System.out.println(obj.reloj_arenaSR(7, '*'));

        System.out.println("CURZ1 sin relleno");
        System.out.println(obj.cruz1SR(5, '*'));

        System.out.println("CURZ2 sin relleno");
        System.out.println(obj.cruz2SR(5, '*'));

        System.out.println("TELEVISA sin relleno");
        System.out.println(obj.televisaSR(6, '¬'));
        
         System.out.println("ESCALERA");
        System.out.println(obj.Escalera(6, '*'));
        
         System.out.println("ESCALERA");
        System.out.println(obj.Escalera2(4, '*'));
        
       //  System.out.println("MOÑO");
       // System.out.println(obj.Moño(7, '*'));
        
        // System.out.println("MOÑO");
        //System.out.println(obj.Moño(6, '*'));
        

    }

}
