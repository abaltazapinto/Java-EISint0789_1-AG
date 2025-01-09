import java.util.Scanner;

class Exercicio3MiniCalculadora
{
    Scanner objetoScanner = new Scanner(System.in);
    
    String operacao = new String();
    int primeiroNumero;
    int segundoNumero;
    int resultadoFinal;
    
    Exercicio3MiniCalculadora()
    {
        System.out.println("Esta é uma mini-calculadora. Escreva soma para adição ou outra coisa para subtração");
        operacao = objetoScanner.nextLine();
        
        System.out.println("Coloque o primeiro número");
        primeiroNumero = objetoScanner.nextInt();
        
        System.out.println("Coloque o segundoNumero");
        segundoNumero = objetoScanner.nextInt();
        
        if(operacao.equalsIgnoreCase("soma"))
        {
            resultadoFinal = primeiroNumero + segundoNumero;
        }
        else
        {
            resultadoFinal = primeiroNumero - segundoNumero;
        }
        
        System.out.println("O resultado foi: " + resultadoFinal);
    }

}