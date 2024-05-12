/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author marip
 */
public class PrbProductos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String mnu[] =
        {
            "Perecederos", "No Perecederos", "Consulta Gral", "Presupuesto producto", "Salir"
        };
        String mnu2[] =
        {
            "Altas", "Bajas", "Consultas", "Modificaciones", "Regresar"
        };
        int opc, opc2; //opc es para menu general y 2 es para cada uno
        Productos p[] = null;
        try
        {
            Productos.setFolio((Integer) ManipulacionArchivos.carga("folios.dat"));
        } catch (Exception e)
        {
            Productos.setFolio(0);
        }
        p = (Productos[]) ManipulacionArchivos.cargaArr("Productos.dat");//carga al incio del programa
        do
        {
            opc = Manipulacion.pintaMenu(mnu, "Principal");
            switch (opc)
            {
                case 1:
                case 2:
                    do
                    {
                        opc2 = Manipulacion.pintaMenu(mnu2, mnu[opc - 1]);
                        switch (opc2)
                        {
                            case 1:
                                p = Manipulacion.inserta(p, Manipulacion.creaObj(opc));//en el parametro que pide obj mando a llamar la funcion para eso
                                break;
                            case 2:
                                p = Manipulacion.bajas(p, opc);
                                break;
                            case 3:
                                System.out.println(Manipulacion.consultas(p, opc, mnu));//consulta particular
                                break;
                            case 4:
                                p = Manipulacion.modificacion(p, null, opc, opc2);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    } while (opc2 != mnu2.length);
                    break;
                case 3:
                    System.out.println(Manipulacion.consultaGral(p));
                    break;
                case 4:
                    Manipulacion.calcPrecioTotal(p);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != mnu.length);//no importa si agrego mas opciones funciona
        ManipulacionArchivos.guarda(p, "Productos.dat"); //guarda al final del programa
        ManipulacionArchivos.guarda(Productos.getFolio(), "folios.dat");
    }

}
