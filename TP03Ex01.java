import java.util.Scanner;

    //Desenvolvido por Beatriz Bastos Borges e Miguel Luizatto Alves

    /*Construir a classe Hora, conforme especificacao
    abaixo, este exercício compora a avaliacao final, portanto sera obrigatoria sua
    elaboracao para a prova final. */

class Hora
{
    
    private int hora;
    private int min;
    private int seg;

    public Hora()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int Hora = scan.nextInt();
        while (Hora < 0 || Hora > 23) 
        {
            System.out.println("Valor das horas invalido! O valor deve estar entre 0 e 23.");
            Hora = scan.nextInt();
        }
        this.hora = Hora;


        System.out.print("\nDigite os minutos: ");
        int Min = scan.nextInt();
        while (Min < 0 || Min > 59) 
        {
            System.out.println("Valor dos minutos invalido! O valor deve estar entre 0 e 59.");
            Min = scan.nextInt();
        }
        this.min = Min;


        System.out.print("\nDigite os segundos: ");
        int Seg = scan.nextInt();
        while (Seg < 0 || Seg > 59) 
        {
            System.out.println("Valor dos segundos invalido! O valor deve estar entre 0 e 59.");
            Seg = scan.nextInt();
        }
        this.seg = Seg;

        System.out.print("\n");
    }

    public Hora(int h, int m, int s)
    {
       setHor(h);
       setMin(m);
       setSeg(s);
    }

    public void setHor(int h)
    {
        if(h >= 0 && h < 24)
            this.hora = h;
        
        else
            System.out.println("Valor invalido. O valor das horas deve estar entre 0 e 23.");
    }
    
    public void setMin(int m)
    {
        if(m >= 0 && m < 60)
            this.min = m;   
        
        else    
            System.out.println("Valor invalido. O valor dos minutos deve estar entre 0 e 59.");
    }
   
    public void setSeg(int s)
    {
        if(s >= 0 && s < 60)
            this.seg = s;   
        
        else    
            System.out.println("Valor invalido. O valor dos segundos deve estar entre 0 e 59.");
    }

    
    public void setHor()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a hora: ");
        int horas = scan.nextInt();

        while(horas < 0 || horas > 23)
        {
            System.out.print("Valor invalido. Digite novamente");
            horas = scan.nextInt();
        }

        this.hora = horas;
    }

    public void setMin()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o(s) minuto(s): ");
        int minutos = scan.nextInt();

        while(minutos < 0 || minutos > 59)
        {
            System.out.print("Valor invalido. Digite novamente");
            minutos = scan.nextInt();
        }

        this.min = minutos;
    }

    public void setSeg()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o(s) segundo(s): ");
        int segundos = scan.nextInt();

        while(segundos < 0 || segundos > 59)
        {
            System.out.print("Valor inválido. Digite novamente");
            segundos = scan.nextInt();
        }

        this.seg = segundos;
    }

    
    public int getHor()
    {
        return this.hora;
    }
    
    public int getMin()
    {
        return this.min;
    }
   
    public int getSeg()
    {
        return this.seg;
    }

    public String getHora1()
    {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    public String getHora2()
    {
        String periodo = (hora < 12) ? "AM" : "PM";

        int hora12 = (hora < 12) ? hora : hora - 12;

        if (hora12 == 0) 
            hora12 = 12;

        return String.format("%02d:%02d:%02d %s", hora12, min, seg, periodo);
    }

    public int getSegundos()
    {
        return hora * 3600 + min * 60 + seg; 
    }
    
}

public class TP03Ex01
{
    public static void main(String[] args)
    {
        
        Hora h1 = new Hora();
        System.out.println("Hora 1: " + h1.getHora1());
        System.out.println("Hora 2: " + h1.getHora2());
        System.out.println("Segundos: " + h1.getSegundos());

        Hora h2 = new Hora(15, 30, 45);
        System.out.println("\nHora 1: " + h2.getHora1());
        System.out.println("Hora 2: " + h2.getHora2());
        System.out.println("Segundos: " + h2.getSegundos() + "\n");

        Hora h3 = new Hora ();
        h3.setHor(23);
        h3.setMin(59);
        h3.setSeg(59);
        System.out.println("Horas: " + h3.getHor());
        System.out.println("Minutos: " + h3.getMin());
        System.out.println("Segundos: " + h3.getSeg());
    }
}

