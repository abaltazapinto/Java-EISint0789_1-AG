import java.util.Random;
import java.util.Scanner;

class adivinharNumero
{
    Random objetoRandom = new Random();
    Random objetoScanner = new Scanner(System.in);
    
    int adivinha;
    int resposta;
    
    adivinharNumero()
    {
        adivinha = objetoRandom.nextInt(21);
        System.out.println("Adivinhe qual o numero que vai sair na sorte");
        resposta = objetoScanner.nextInt();
        while(true)
        {
            if(adivinha > resposta) 
            {
                System.out.println("Quase mas tem de tentar um numero mais alto");
            }else if (adivinha < resposta)
            {
                System.out.println("");
            }
        }
            
        
        
    }
}