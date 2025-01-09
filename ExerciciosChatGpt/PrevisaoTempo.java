import java.util.Random;
import java.util.Scanner;

class PrevisaoTempo{
    Scanner objetoScanner = new Scanner(System.in);
    Random temperaturaAleatoria = new Random();

    PrevisaoTempo(){
        int temperatura = temperaturaAleatoria.nextInt(50) - 10;
        
        if(temperatura < 10)
        {
            System.out.println("Frio, a temperatura está " + temperatura);
        }
        else if(temperatura > 9 && temperatura < 26) 
        {
            System.out.println("Agradável, a temperatura está " + temperatura);
        }
        else
        {
            System.out.println("Quente, a temperatura está " + temperatura);
        }
    }
}