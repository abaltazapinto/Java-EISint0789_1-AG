import java.util.Scanner;

class CalculadoraDesconto {
    Scanner objetoScanner = new Scanner(System.in);
    float preco;
    float desconto;
    float precoComDesconto;
    float descontoEmSiMesmo;
    
    CalculadoraDesconto(){
        System.out.println("Qual o preco original do produto ?");
        preco = objetoScanner.nextInt();
        System.out.println("Qual a percentagem de desconto você desejaria ?");
        desconto = objetoScanner.nextFloat();
        float precoComDesconto = preco * (1 - (desconto/100));
        float descontoEmSiMesmo =  preco * (desconto / 100);
        System.out.println("O preco do seu artigo com desconto seria " + precoComDesconto);
        System.out.println("Que se traduz que voce acabou de amealhar " + descontoEmSiMesmo);
        
        
    }
}