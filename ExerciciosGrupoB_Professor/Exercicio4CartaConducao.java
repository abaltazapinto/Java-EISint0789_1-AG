import java.util.Scanner;

class Exercicio4CartaConducao
{

    Scanner objetoScanner = new Scanner(System.in);
    
    int idade;
    int anosFaltam;
    
    Exercicio4CartaConducao()
    {
        System.out.println("Este programa se pode entrar nesta escola de condução. Escreva a sua idade:");
        
        idade = objetoScanner.nextInt();
        
        if(idade >= 18)
        {
            System.out.println("Já pode tirar a carta de condução!");
        }
        else
        {
            anosFaltam = 18 - idade;
            
            System.out.println("Faltam " + anosFaltam +  " anos para tirar a carta de condução!");
        }
    }

}
