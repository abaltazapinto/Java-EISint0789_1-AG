import java.util.Scanner;

class ProblemaNextLine
{
    
    Scanner objetoScanner = new Scanner(System.in);
    
    int valor;
    
    String texto = new String();
    
    ProblemaNextLine()
    {
        System.out.println("Escreva número");
        valor = objetoScanner.nextInt();
        
        // Necessário para evitar o bloqueio do input no terminar. 
        // Acontece quando existe um pedido de um número e depois o pedido de um texto...
        objetoScanner.nextLine();
        
        System.out.println("Escreva texto");      
        texto = objetoScanner.nextLine();
        
    }
}