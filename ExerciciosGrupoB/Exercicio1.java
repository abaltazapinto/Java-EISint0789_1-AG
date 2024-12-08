import java.util.Scanner;

class Exercicio1 {
    Scanner objetoScanner = new Scanner(System.in);
    String username = new String();
    String password = new String();
    
    Exercicio1()
    {
     System.out.println("Por favor, introduza o seu username");
     username = objetoScanner.nextLine();
     System.out.println("Neste momento, só falta introduzir a sua passsword para concluir a autenticão?");
     password = objetoScanner.nextLine();
     
     if(username.equals("utilizador") && password.equals("abz"))
     {
         System.out.println("Autenticaão completa");
     }
     else 
     {
         System.out.println("Autenticacao invalida");
     }
        
    }
}