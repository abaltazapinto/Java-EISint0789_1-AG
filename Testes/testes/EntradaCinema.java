import java.util.Scanner;

class EntradaCinema{    
    Scanner objetoScanner = new Scanner(System.in);
    
    int idade;

    EntradaCinema()
    {
        System.out.println("Verificão para entreda no cinema! Qual é a sua idade ?");
        idade = objetoScanner.nextInt();
        
        if(idade < 18)
        {
            System.out.println("Proibido Entrar!");
        }
        else
        {
            System.out.println("Seja bem-vindo!");
        }
    }
}