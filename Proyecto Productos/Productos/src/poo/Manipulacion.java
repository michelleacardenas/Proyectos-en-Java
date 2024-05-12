/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author marip
 */
public class Manipulacion
{

    public static int pintaMenu(String[] mnu, String s)
    {
        System.out.println("===MENU " + s + "===");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i + 1) + ".-" + mnu[i]);
        }
        System.out.println("Elige una opcion: ");
        return Lecturas.leerEntero(true);
    }

    public static Productos[] inserta(Productos[] p, Productos obj)
    {
        if (p == null)
        {
            p = new Productos[1];
        } else
        {
            Productos nvo[] = new Productos[p.length + 1];
            System.arraycopy(p, 0, nvo, 0, p.length);
            p = nvo;
        }
        p[p.length - 1] = obj;
        return p;
    }

    public static Productos creaObj(int opc) //recibe opc para saber si lo que estoy creando es perecedero o no
    {
        String nom;
        double precio;
        int existencias;
        int lote;
        String fechaCad;
        //ya que tengo mis declaraciones empiezo a leer datos excepto id que se genera
        System.out.print("Dame el nombre del producto: "); //sin ln para leer em¿n misma linea
        nom = Lecturas.leerString();
        System.out.print("Dame el precio del producto: ");
        precio = Lecturas.leerDouble();
        System.out.print("Dame las existencias del producto: ");
        existencias = Lecturas.leerEntero();
        if (opc == 1)//seran perecederos
        {
            System.out.print("Dame la fecha de caducidad del producto: "); //sin nl para leer em¿n misma linea
            fechaCad = Lecturas.leerString();
            return new Perecederos(fechaCad, nom, precio, existencias);
        } else
        {
            System.out.print("Dame el lote del producto: "); //sin nl para leer em¿n misma linea
            lote = Lecturas.leerEntero();
            return new NoPerecederos(lote, nom, precio, existencias);
        }
    }

    public static Productos creaObj(int opc, String id) //recibe opc para saber si lo que estoy creando es perecedero o no
    {
        String nom;
        double precio;
        int existencias;
        int lote;
        String fechaCad;
        //ya que tengo mis declaraciones empiezo a leer datos excepto id que se genera
        System.out.print("Dame el nombre del producto: "); //sin ln para leer em¿n misma linea
        nom = Lecturas.leerString();
        System.out.print("Dame el precio del producto: ");
        precio = Lecturas.leerDouble();
        System.out.print("Dame las existencias del producto: ");
        existencias = Lecturas.leerEntero();
        if (opc == 1)//seran perecederos
        {
            System.out.print("Dame la fecha de caducidad del producto: "); //sin nl para leer em¿n misma linea
            fechaCad = Lecturas.leerString();
            return new Perecederos(id, fechaCad, nom, precio, existencias);
        } else
        {
            System.out.print("Dame el lote del producto: "); //sin nl para leer em¿n misma linea
            lote = Lecturas.leerEntero();
            return new NoPerecederos(id, lote, nom, precio, existencias);
        }
    }

    public static String consultaGral(Productos[] p)
    {
        String s = "";
        try
        {
            System.out.println("id\tnom\tprecio\texist\tlote\\fechaCad"); //doble diagonal para una diagonal
            for (int i = 0; i < p.length; i++)
            {
                s += p[i].toString();//el toString es el que pone la info del obj como el desp
            }
        } catch (Exception e)
        {
            s = "NO HAY DATOS DE PRODUCTOS";
        }
        return s;
    }

    public static String consultas(Productos[] p, int opc, String[] mnu)
    {
        String s = "";
        try
        {
            if (opc == 1)
            {
                System.out.println("id\tnom\tprecio\texist\tfechaCad");//perecederos fechaCad
            } else
            {
                System.out.println("id\tnom\tprecio\texist\tlote");//lote
            }
            for (int i = 0; i < p.length; i++)
            {
                if (opc == 1 && p[i] instanceof Perecederos) //para ver como fue creado el producto
                {
                    s += p[i].toString();
                } else
                {
                    if (opc == 2 && p[i] instanceof NoPerecederos)
                    {
                        s += p[i].toString();
                    }
                }
            }
        } catch (Exception e)
        {
            s = "NO HAY DATOS " + mnu[opc - 1];//menos 1 porque los arreglos inician en 0
        }
        return s;
    }

    public static int busca(String id, Productos p[])
    {
        if (p != null)
        {
            for (int i = 0; i < p.length; i++)
            {
                if (p[i].getId().equals(id))
                {
                    return i;
                }
            }
        } else
        {
            System.out.println("No hay productos registrados");

        }
        return -1;
    }

    public static Productos[] bajas(Productos[] p, int opc)
    {
        System.out.println("== BAJAS ==");
        boolean valor = false;
        System.out.println("Dame el id del producto");
        String s = Lecturas.leerString();
        int pos = busca(s, p);
        if (p != null) //si el arreglo no es nulo
        {
            if (pos >= 0 && pos < p.length) //Si la posicion a eliminar esta dentro del parametro del arreglo
            {
                if (pos == 0 && p.length == 1) //si p es 0 y el arreglo solo tiene 1 posicion -> BORRANDO EL ULTIMO DATO QUE EXISTIA
                {
                    if (opc == 1 && p[0] instanceof Perecederos)
                    {
                        p = null; // el arreglo se vuelve nulo
                        System.out.println("BAJA REALIZADA CON ÉXITO");
                    }
                    if (opc == 2 && p[0] instanceof NoPerecederos)
                    {
                        p = null; // el arreglo se vuelve nulo
                        System.out.println("BAJA REALIZADA CON ÉXITO");
                    }
                    if (p != null)
                    {
                        System.out.println("BAJA RECHAZADA--> Categoría de producto incorrecta");
                        return p;
                    }
                } else // si el arreglo tiene mas posiciones
                {
                    if (pos == -1)
                    {
                        System.out.println("Id no encontrado");
                        return p;
                    } else
                    {
                        valor = Manipulacion.verificaCategoria(opc, pos, p, valor);
                    }
                    if (valor == true)
                    {
                        Productos nuevo[] = new Productos[p.length - 1]; //el nuevo arreglo menos 1 que es la posicion que desaparece
                        for (int j = 0, i = 0; i < p.length; i++)
                        {
                            if (i != pos) //si la posicion i es diferente de la que se eliminara
                            {
                                nuevo[j++] = p[i]; //el valor en i se agrega al nuevo arreglo
                            }
                        }
                        p = nuevo;
                        System.out.println("BAJA REALIZADA CON ÉXITO");
                        return p;
                    } else
                    {
                        System.out.println("BAJA RECHAZADA--> Categoría de producto incorrecta");
                        return p;
                    }
                }
            } else
            {
                System.out.println(" Id no encontrado "); //Cuando la posicion esta  fuera del tamaño del arreglo
            }
        } else
        {
            System.out.println("No hay datos "); //si es arreglo nulo
        }
        return p;
    }
    
    public static Productos[] modificacion(Productos p[], Productos obj, int opc,int pos)
    {
        if (p != null)
        {
            System.out.println("Id del producto:");
            String id = Lecturas.leerString();
            pos=Manipulacion.busca(id, p);
            boolean valor = false;
            if (pos == -1)
            {
                System.out.println("Id no encontrado");
            } else
            {
                valor = Manipulacion.verificaCategoria(opc, pos, p, valor);
                if (valor == true)
                {
                    System.out.println("Producto a modificar: " + p[pos]);//se muestra producto a modificar
                    obj = Manipulacion.creaObj(opc, id);
                    Productos nvo[] = new Productos[p.length];
                    System.arraycopy(p, 0, nvo, 0, p.length);
                    p = nvo;
                    p[pos] = obj;

                } else
                {
                    System.out.println("Cambio rechazado--> Categoría incorrecta");
                }
            }
        } else
        {
            System.out.println("No hay productos registrados");
        }
        return p;
    }

    public static boolean verificaCategoria(int opc, int pos, Productos p[], boolean valor)
    {
        if (opc == 1 && p[pos] instanceof Perecederos)
        {
            valor = true;
        } else
        {
            if (opc == 2 && p[pos] instanceof NoPerecederos)
            {
                valor = true;
            }
        }
        return valor;
    }

    public static void calcPrecioTotal(Productos p[])
    {
        if (p != null)
        {
            System.out.println("Dame el id del producto");
            String s = Lecturas.leerString();
            int pos = busca(s, p);
            if (pos == -1)
            {
                System.out.println("Dato no encontrado");
            } else
            {
                System.out.print("Dame la cantidad a presupuestar: ");
                int cant = Lecturas.leerEntero();
                System.out.println("Cantidad = " + cant);
                System.out.println("Precio = " + p[pos].getPrecio());
                double monto = cant * p[pos].getPrecio();
                System.out.println("Monto = " + monto);
                double iva = p[pos].calIva(cant, p[pos].getPrecio());
                System.out.println("IVA = " + iva);
                System.out.println("Total = " + (monto + iva));
            }
        } else
        {
            System.out.println("No hay productos");
        }
    }
}
