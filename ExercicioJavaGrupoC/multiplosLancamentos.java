import java.util.Random;
import java.util.Scanner;

class multiplosLancamentos {
    
    Scanner objetoInput = new Scanner(System.in);
    Random numeroDadoAleatorio = new Random();
    
    int dado1 = numeroDadoAleatorio.nextInt(6) + 1;
    int dado2 = numeroDadoAleatorio.nextInt(6) + 1;
    int dado3 = numeroDadoAleatorio.nextInt(6) + 1;
    int dado4 = numeroDadoAleatorio.nextInt(6) + 1;
    int dado5 = numeroDadoAleatorio.nextInt(6) + 1;
    int dado6 = numeroDadoAleatorio.nextInt(6) + 1;
    
    
    
    multiplosLancamentos() {
            System.out.println("Quantos dados quer");
            System.out.println("Escolha um numero entre 10 e 50");
            int numeroDeDadosPedidos = objetoInput.nextInt();
            lancarDado(numeroDeDadosPedidos);
        
    }
    
    void lancarDado(int number)
    {       
        int somatorio = 0;
        for (int i = 0; i < number; i++) 
        {
            int resultado = numeroDadoAleatorio.nextInt(6) + 1;
            System.out.println("Lancamento " + (i + 1) + ": " + resultado);
            somatorio += resultado;
        }
        
        System.out.println("Somatório de todos os lancamentos: " + somatorio);
    }
}