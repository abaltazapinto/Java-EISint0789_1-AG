import java.util.Random;
import java.util.Scanner;


class Mes{
    Scanner objetoScanner = new Scanner(System.in);
    int numeroMes;
    
    Mes()
    {
        System.out.println("Por favor indique um número de 1 a 12 que represente 1 mês");
        
        numeroMes = objetoScanner.nextInt(12);
        
        System.out.println(numeroMes);
        
        
        switch(numeroMes)
        {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Outubro");
                break;
            case 13:
                System.out.println("Novembro");
                break;
            case 14:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Tem de escolher entre 1 e 12");
            
            
        }
            
        
    }
}