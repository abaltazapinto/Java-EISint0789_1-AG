import java.util.Scanner;

class EntradaCinema
{
    Scanner objetoScanner = new Scanner(System.in);
    
    int idade;
    
    EntradaCinema()
    {
        System.out.println("Verificação para entrada no cinema! Qual é a sua idade?");
        idade = objetoScanner.nextInt();
        
        if( idade >= 18 )
        {
            System.out.println("Entrada permitida!");
        }
        else
        {
            System.out.println("Proibida a entrada!");
        }
    }
}