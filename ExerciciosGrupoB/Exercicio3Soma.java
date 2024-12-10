import java.util.Scanner;

class Exercicio3Soma {
    Scanner objetoScanner = new Scanner(System.in);
    
    String resposta = new String();
    int numero1;
    int numero2;
    int soma;
    int subtrair;
    
    Exercicio3Soma()
    {
        System.out.println("Indique, por favor, se quer realizar uma conta de somar, em escrevendo soma. Se pretender fazer uma subtracão escreva outra palavra qualquer.");
        
        resposta = objetoScanner.nextLine();
        
        if(resposta.equalsIgnoreCase("soma"))
        {
            System.out.println("Por favor introduza o primeiro numero para somar");
            numero1 = objetoScanner.nextInt();
            System.out.println("Por favor introduza o segundo numero para somar");
            numero2 = objetoScanner.nextInt();
            soma = numero1 + numero2;
            
            System.out.println("O resultado da sua soma é " + soma);
        }
        else
        {
            System.out.println("Por favor introduza o primeiro numero para sutrair");
            numero1 = objetoScanner.nextInt();
            System.out.println("Por favor introduza o segundo numero para subtrair");
            numero2 = objetoScanner.nextInt();
            subtrair = numero1 - numero2;
            
            System.out.println("O resultado da sua subtracão é " + subtrair);
        }
        
    }
}