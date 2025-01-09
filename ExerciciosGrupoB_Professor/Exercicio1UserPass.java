import java.util.Scanner;

class Exercicio1UserPass
{
    Scanner objetoScanner = new Scanner(System.in);
    
    String username = new String();
    
    String password = new String();
    
    Exercicio1UserPass()
    {
        System.out.println("Coloque o username correto:");
        username = objetoScanner.nextLine();
        
        System.out.println("Coloque a password correta:");
        password = objetoScanner.nextLine();
        
        if( username.equals("utilizador") && password.equals("abz") )
        {
            System.out.println("Autenticação completa!");
        }
        else
        {
            System.out.println("Autenticação inválida!");
        }
    }
}
