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
public class Figuras
{

    public String linea(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            s = s + c + " "; //s+=c CONCATENAR ESPACIO 
        }
        return s;
    }

    public String lineaD(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s = s + c + " ";
            i++;
        } while (i < n);
        return s;
    }

    public String lineaW(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s = s + c + " ";
            i++;
        }
        return s;
    }

    public String cuadro(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            s += linea(n, c) + "\n";
        }
        return s;
    }

    public String cuadroD(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s += linea(n, c) + "\n";
            i++;
        } while (i < n);
        return s;
    }

    public String cuadroW(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s += linea(n, c) + "\n";
            i++;
        }
        return s;
    }

    public String tii(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            s += linea(i + 1, c) + "\n"; //CAMBIAR PARAMETRO DE LINEA 
        }
        return s;
    }

    public String tiiD(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s += linea(i + 1, c) + "\n";
            i++;
        } while (i < n);
        return s;
    }

    public String tiiW(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s += linea(i + 1, c) + "\n";
            i++;
        }
        return s;
    }

    public String tsi(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            s += linea(n - i, c) + "\n"; //CAMBIAR PARAMETRO DE LINEA n-1 para valor decreciente
        }
        return s;
    }

    public String tsiD(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s += linea(n - i, c) + "\n";
            i++;
        } while (i < n);
        return s;
    }

    public String tsiW(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s += linea(n - i, c) + "\n";
            i++;
        }
        return s;
    }

    public String tsd(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            //CONCATENAR linea al inicio para espacios blancos
            s += linea(i, ' ') + linea(n - i, c) + "\n"; //CAMBIAR PARAMETRO DE LINEA 
        }
        return s;
    }

    public String tsdD(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s += linea(i, ' ') + linea(n - i, c) + "\n";
            i++;
        } while (i < n);
        return s;
    }

    public String tsdW(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s += linea(i, ' ') + linea(n - i, c) + "\n";
            i++;
        }
        return s;
    }

    public String tid(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {

            s += linea(n - i - 1, ' ') + linea(i + 1, c) + "\n";

        }
        return s;
    }

    public String tidD(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s += linea(n - i - 1, ' ') + linea(i + 1, c) + "\n";
            i++;
        } while (i < n);
        return s;
    }

    public String tidW(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s += linea(n - i - 1, ' ') + linea(i + 1, c) + "\n";
            i++;
        }
        return s;
    }

    public String rombo(int n, char c)
    {
        String s = "";
        int cont = 3;
        for (int i = 0; i < n; i += 2)
        {
            s += linea(cont, ' ') + linea(i + 1, c) + "\n";
            cont -= 1;
            // i--;
        }
        cont = 0;
        for (int i = 0; i < n; i += 2)
        {
            s += linea(cont, ' ') + linea(n - i, c) + "\n";
            cont += 1;
        }
        return s;
    }

    public String romboDo(int n, char c)
    {
        String s = "";
        int cont = 3;
        int i = 0;
        do
        {
            s += linea(cont, ' ') + linea(i + 1, c) + "\n";
            cont -= 1;
            i += 2;
        } while (i < n);
        cont = 0;
        i = 0;
        do
        {
            s += linea(cont, ' ') + linea(n - i, c) + "\n";
            cont += 1;
            i += 2;
        } while (i < n);
        return s;
    }

    public String romboW(int n, char c)
    {
        String s = "";
        int cont = 3;
        int i = 0;
        while (i < n)
        {
            s += linea(cont, ' ') + linea(i + 1, c) + "\n";
            cont -= 1;
            i += 2;
        }
        cont = 0;
        i = 0;
        while (i < n)
        {
            s += linea(cont, ' ') + linea(n - i, c) + "\n";
            cont += 1;
            i += 2;
        }
        return s;
    }

    public String RomboMargen(int n, char c)
    {
        String s = "";
        int cont = 7;
        for (int i = 0; i < n; i += 2)
        {
            s += linea(cont, c) + linea(i, ' ') + linea(cont, c) + "\n";
            cont -= 1;
        }

        cont = 4;
        for (int i = 0; i < n; i += 2)
        {
            s += linea(cont, c) + linea(n - i - 1, ' ') + linea(cont, c) + "\n";
            cont += 1;
        }

        return s;
    }

    public String RomboMargenDo(int n, char c)
    {
        String s = "";
        int cont = 7;
        int i = 0;
        do
        {
            s += linea(cont, c) + linea(i, ' ') + linea(cont, c) + "\n";
            cont -= 1;
            i += 2;
        } while (i < n);
        cont = 4;
        i = 0;
        do
        {
            s += linea(cont, c) + linea(n - i - 1, ' ') + linea(cont, c) + "\n";
            cont += 1;
            i += 2;
        } while (i < n);
        return s;
    }

    public String RomboMargenW(int n, char c)
    {
        String s = "";
        int cont = 7;
        int i = 0;
        while (i < n)
        {
            s += linea(cont, c) + linea(i, ' ') + linea(cont, c) + "\n";
            cont -= 1;
            i += 2;
        }
        cont = 4;
        i = 0;
        while (i < n)
        {
            s += linea(cont, c) + linea(n - i - 1, ' ') + linea(cont, c) + "\n";
            cont += 1;
            i += 2;
        }
        return s;
    }

    public String reloj_arena(int n, char c)
    {
        String s = "";
        int cont = 0;
        for (int i = 0; i < n; i += 2)
        {
            s += linea(cont, ' ') + linea(n - i, c) + "\n";
            cont += 1;
        }
        cont = 3;
        for (int i = 0; i < n; i += 2)
        {
            s += linea(cont, ' ') + linea(i + 1, c) + "\n";
            cont -= 1;
            // i--;
        }
        return s;
    }

    public String RelojArenaDo(int n, char c)
    {
        String s = "";
        int cont = 0;
        int i = 0;
        do
        {
            s += linea(cont, ' ') + linea(n - i, c) + "\n";
            cont += 1;
            i += 2;
        } while (i < n);
        cont = 3;
        i = 0;
        do
        {
            s += linea(cont, ' ') + linea(i + 1, c) + "\n";
            cont -= 1;
            i += 2;
        } while (i < n);
        return s;
    }

    public String RelojArenaW(int n, char c)
    {
        String s = "";
        int cont = 0;
        int i = 0;
        while (i < n)
        {
            s += linea(cont, ' ') + linea(n - i, c) + "\n";
            cont += 1;
            i += 2;
        }
        cont = 3;
        i = 0;
        while (i < n)
        {
            s += linea(cont, ' ') + linea(i + 1, c) + "\n";
            cont -= 1;
            i += 2;
        }
        return s;
    }

    public String cruz1(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
        }
        for (int i = 0; i < n; i++)
        {
            s += linea(n, c) + linea(n, c) + linea(n, c) + "\n";
        }
        for (int i = 0; i < n; i++)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
        }
        return s;
    }

    public String Cruz1Do(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        } while (i < n);
        i = 0;
        do
        {
            s += linea(n, c) + linea(n, c) + linea(n, c) + "\n";
            i++;
        } while (i < n);
        i = 0;
        do
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        } while (i < n);
        return s;
    }

    public String Cruz1W(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        }
        i = 0;
        while (i < n)
        {
            s += linea(n, c) + linea(n, c) + linea(n, c) + "\n";
            i++;
        }
        i = 0;
        while (i < n)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        }
        return s;
    }

    public String cruz2(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
        }
        for (int i = 0; i < n; i++)
        {
            s += linea(n, c) + linea(n, c) + linea(n, c) + "\n";
        }
        for (int i = 0; i < n; i++)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            s += linea(n, ' ') + linea(n, c) + "\n";
        }
        return s;
    }

    public String Cruz2Do(int n, char c)
    {
        String s = "";
        int i = 0;
        do
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        } while (i < n);
        i = 0;
        do
        {
            s += linea(n, c) + linea(n, c) + linea(n, c) + "\n";
            i++;
        } while (i < n);
        i = 0;
        do
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        } while (i < n);
        return s;
    }

    public String Cruz2W(int n, char c)
    {
        String s = "";
        int i = 0;
        while (i < n)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        }
        i = 0;
        while (i < n)
        {
            s += linea(n, c) + linea(n, c) + linea(n, c) + "\n";
            i++;
        }
        i = 0;
        while (i < n)
        {
            s += linea(n, ' ') + linea(n, c) + "\n";
            s += linea(n, ' ') + linea(n, c) + "\n";
            i++;
        }
        return s;
    }

    public String televisa(int n, char c)
    {
        String s = "";
        int cont = 16;
        for (int i = 0; i < n * 6; i += 6)
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, '´') + linea(n, c) + "\n";
            cont -= 3;
        }
        cont = 3;
        for (int i = 24; i >= 0; i -= 6)
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, '´') + linea(n, c) + "\n";
            cont += 3;
        }
        return s;
    }

    public String TelevisaDo(int n, char c)
    {
        String s = "";
        int cont = 16;
        int i = 0;
        do
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, '´') + linea(n, c) + "\n";
            cont -= 3;
            i += 6;
        } while (i < n * 6);
        cont = 3;
        i = 24;
        do
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, '´') + linea(n, c) + "\n";
            cont += 3;
            i -= 6;
        } while (i >= 0);
        return s;
    }

    public String TelevisaW(int n, char c)
    {
        String s = "";
        int cont = 16;
        int i = 0;
        while (i < n * 6)
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, '´') + linea(n, c) + "\n";
            cont -= 3;
            i += 6;
        }
        cont = 3;
        i = 24;
        while (i >= 0)
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, '´') + linea(n, c) + "\n";
            cont += 3;
            i -= 6;
        }
        return s;
    }

    public String cuadroSR(int n, char c)
    {
        String s = "";
        s += linea(n, c) + "\n";
        for (int i = 0; i < n - 2; i++)
        {
            s += linea(1, c) + linea(n - 2, ' ') + linea(1, c) + "\n";
        }
        s += linea(n, c) + "\n";
        return s;
    }

    public String tiiSR(int n, char c)
    {
        String s = "";
        System.out.println("*");
        for (int i = 0; i < n; i++)
        {
            s += linea(1, c) + linea(i, ' ') + linea(1, c) + "\n"; //CAMBIAR PARAMETRO DE LINEA 
        }
        s += linea(n + 2, c);
        return s;
    }

    public String tsiSR(int n, char c)
    {
        String s = "";
        s += linea(n, c) + "\n";
        for (int i = 4; i >= 0; i--)
        {
            s += linea(1, c) + linea(i, ' ') + linea(1, c) + "\n"; //CAMBIAR PARAMETRO DE LINEA n-1 para valor decreciente
        }
        s += '*';
        return s;

    }

    public String tsdSR(int n, char c)
    {
        String s = "";
        s += linea(n, c) + "\n";
        int cont = 4;
        for (int i = 0; i < n - 2; i++)
        {
            s += linea(i + 1, ' ') + linea(1, c) + linea(cont, ' ') + linea(1, c) + "\n";
            cont--;
        }
        s += linea(n - 1, ' ') + '*';
        return s;
    }

    public String tidSR(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                s += linea(n, ' ') + linea(1, c) + "\n";
            }
            s += linea(n - i - 1, ' ') + linea(1, c) + linea(i, ' ') + linea(1, c) + "\n";
            if (i == n - 1)
            {
                s += linea(n + 1, c) + "\n";
            }
        }
        return s;
    }

    public String romboSR(int n, char c)
    {
        String s = "";
        int cont = 3;
        for (int i = 0; i < n - 1; i += 2)
        {
            if (i == 0)
            {
                s += linea(cont, ' ') + linea(i + 1, c) + "\n";
                cont -= 1;
            }
            s += linea(cont, ' ') + linea(1, c) + linea(i + 1, ' ') + linea(1, c) + "\n";
            cont -= 1;
        }
        cont = 0;
        for (int i = 5; i >= 0; i -= 2)
        {
            s += linea(cont, ' ') + linea(1, c) + linea(i, ' ') + linea(1, c) + "\n";
            cont += 1;
            if (i == 1)
            {
                s += linea(cont, ' ') + linea(1, '*');
            }
        }
        return s;
    }

    public String reloj_arenaSR(int n, char c)
    {
        String s = "";
        int cont = 0, esp = 3;
        for (int i = 0; i < n - 3; i += 2)
        {
            if (i == 0)
            {
                s += linea(cont, ' ') + linea(n - i, c) + "\n";
                cont += 1;
            }
            if (i >= n - 1)
            {
                s += linea(cont, ' ') + linea(1, c) + "\n";
            }

            s += linea(cont, ' ') + linea(1, c) + linea(esp, ' ') + linea(1, c) + "\n";
            cont += 1;
            esp -= 2;
        }
        cont = 3;
        esp = 1;
        for (int i = 0; i < n; i += 2)
        {
            if (i == 0)
            {
                s += linea(cont, ' ') + '*' + "\n";
                cont -= 1;
            }
            if (i == n - 1)
            {
                s += linea(n - 1, '*');
            }
            s += linea(cont, ' ') + '*' + linea(esp, ' ') + '*' + "\n";
            cont -= 1;
            esp += 2;
        }
        return s;
    }

    public String cruz1SR(int n, char c)
    {
        String s = "";
        int d = 1, iz = 1;
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                s += linea(n, ' ') + linea(n, c) + "\n";
            }
            s += linea(n, ' ') + linea(iz, c) + linea(n - 2, ' ') + linea(d, c) + "\n";
        }
        for (int i = 0; i < n - 2; i++)
        {
            if (i == 0)
            {
                s += linea(n + 1, c) + linea(n - 2, ' ') + linea(n + 1, c) + "\n";
            }
            s += linea(iz, c) + linea(n * 3 - 2, ' ') + linea(d, c) + "\n";
        }
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                s += linea(n + 1, c) + linea(n - 2, ' ') + linea(n + 1, c) + "\n";
            }
            s += linea(n, ' ') + linea(iz, c) + linea(n - 2, ' ') + linea(d, c) + "\n";
        }
        s += linea(n, ' ') + linea(n, c);
        return s;
    }

    public String cruz2SR(int n, char c)
    {
        String s = "";
        int d = 1, iz = 1;
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                s += linea(n, ' ') + linea(n, c) + "\n";
            }
            s += linea(n, ' ') + linea(iz, c) + linea(n - 2, ' ') + linea(d, c) + "\n";
        }
        for (int i = 0; i < n - 2; i++)
        {
            if (i == 0)
            {
                s += linea(n + 1, c) + linea(n - 2, ' ') + linea(n + 1, c) + "\n";
            }
            s += linea(iz, c) + linea(n * 3 - 2, ' ') + linea(d, c) + "\n";
        }
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                s += linea(n + 1, c) + linea(n - 2, ' ') + linea(n + 1, c) + "\n";
            }
            s += linea(n, ' ') + linea(iz, c) + linea(n - 2, ' ') + linea(d, c) + "\n";
            s += linea(n, ' ') + linea(iz, c) + linea(n - 2, ' ') + linea(d, c) + "\n";
        }
        s += linea(n, ' ') + linea(n, c);
        return s;
    }

    public String televisaSR(int n, char c)
    {
        String s = "";
        int cont = 16;
        for (int i = 0; i < n * 6; i += 6)
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, ' ') + linea(n, c) + "\n";
            cont -= 3;
        }
        cont = 3;
        for (int i = 24; i >= 0; i -= 6)
        {
            s += linea(cont, ' ') + linea(n, c) + linea(i, ' ') + linea(n, c) + "\n";
            cont += 3;
        }
        return s;
    }

    public String Escalera(int n, char c)
    {
        String s = "";
        int cont = 0, x = 1, y = 3;
        for (int i = 0; i < n; i++)
        {
            s += linea(x, c) + linea(cont, ' ') + linea(y, c) + "\n";
            cont += 2;
            for (int j = 0; j < 1; j++)
            {
                s += linea(x, c) + linea(cont, ' ') + linea(x, c) + "\n";
            }
        }
        s += linea(n*2+2, c);
        return s;
    }
    public String Escalera2(int n, char c)
    {
        String s = "";
        int cont = 0, x = 1, y = 3;
        for (int i = 0; i < n; i++)
        {
            s += linea(x, c) + linea(cont-n-2, ' ') + linea(n-1, c) + "\n";
            cont += 2;
                s += linea(x, c) + linea(cont, ' ') + linea(x, c) + "\n";    
        }
        s += linea(n*2+2, c);
        return s;
    }

    public String Moño(int n, char c)
    {
        String s = "";
        int cont = 0;
        for (int i = 0; i < n / 2; i++)
        {
            if (i == 0)
            {
                s += linea(1, c) + linea(n - 2, ' ') + linea(1, c) + "\n";
                cont += 2;
                i += 1;
            }
            if (i == 3)
            {
                s += linea(n, c) + "\n";
                cont += 2;
                i+=1;
            }
            s += linea(1, c) + linea(cont - 2, ' ') + linea(1, c) + linea(n - 2 - cont, ' ') + linea(1, c) + linea(n - 7, ' ') + linea(1, c) + "\n";
            cont += 2;
        }

        return s;
    }

    public String Moñot(int n, char c)
    {
        String s = "";
        int cont=0;
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                s += linea(1, c) +linea(n, ' ') + linea(1, c) + "\n";
                
            }
            s += linea(1, c) + linea(i, ' ') + linea(1, c) + linea(n -cont - 1, ' ') + linea(1, c) + linea(n -cont - 1, ' ') + linea(1, c)+"\n"; //CAMBIAR PARAMETRO DE LINEA
            cont++;
           
            if (i == n - 1)
            {
               s += linea(1, c) +linea(n, ' ') + linea(1, c) + "\n";
            }
        }

        return s;
    }

     public String tidS(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                s += linea(n, ' ') + linea(1, c) + "\n";
            }
            s += linea(n - i - 1, ' ') + linea(1, c) + linea(i, ' ') + linea(1, c) + "\n";
            if (i == n - 1)
            {
                s += linea(n + 1, c) + "\n";
            }
        }
        return s;
    }
    }

