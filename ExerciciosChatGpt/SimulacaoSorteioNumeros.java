import java.util.Random;
import java.util.Scanner;

class SimulacaoSorteioNumeros{
    Scanner objetoScanner = new Scanner(System.in);
    Random objetoRandom = new Random();
    
    int numero1;
    int numero2;
    int numero3;
    int random1; 
    int random2;
    int random3;
    
    SimulacaoSorteioNumeros(){
        System.out.println("Por favor insira três números");
        numero1 = objetoScanner.nextInt();
        numero2 = objetoScanner.nextInt();
        numero3 = objetoScanner.nextInt();
        
        random1 = objetoRandom.nextInt(50) +1;
        random2 = objetoRandom.nextInt(50) +1;
        random3 = objetoRandom.nextInt(50) +1;
        
        System.out.println(random1 + " " + random2 + " " +  random3 + " ;");
        
        while(true)
        {
            
            if(numero1 == random1 && numero2 == random2 && numero3 == random3)
            {    
                System.out.println("Acertaste 3 numeros");
                break;
            }
            else if(numero1 == random1 && numero3 == random3 || numero2 == random2 && numero1 == random1)
            {
                System.out.println("Acertaste 2 numeros");
                break;
            }
            else 
            {   
                System.out.println("Acertas te em nenhum numero " + numero1 + " " + random1 + " " + numero2 + " " + random2 + " " + numero3 + " " + random3);
                break;
            }
        }
        
    }
}