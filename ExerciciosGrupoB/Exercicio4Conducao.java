import java.util.Scanner;


class Exercicio4Conducao {
    Scanner objetoScanner = new Scanner(System.in);
    
    int idade;
    int faltamPara18;
    
    Exercicio4Conducao()
    {
        System.out.println("Que idade já tens?");
        idade = objetoScanner.nextInt();
        
        if(idade < 18)
        {
            faltamPara18 = 18 - idade;
            
            System.out.println("Faltam " + faltamPara18 + " anos para tirar a carta de conducão!");
        }
        else
        {
            System.out.println("Já pode tirar a carta de conducao");
        }
        
    }
}