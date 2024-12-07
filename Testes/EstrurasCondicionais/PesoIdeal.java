import java.util.Scanner;

class PesoIdeal
{
    Scanner objetoScanner = new Scanner(System.in);
    
    String genero = new String();
    
    PesoIdeal()
    {
        System.out.println("Coloque o seu género. Escreva homem ou mulher.");
        
        genero = objetoScanner.nextLine();
        
        if( genero.equals("homem") )
        {
            
        }
        
    }
    
}