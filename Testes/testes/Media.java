import java.util.Scanner;

class Media {
    Scanner objetoScanner = new Scanner(System.in);
    
    float nota1;
    float nota2;
    float nota3;
    
    float media;
    
    Media()
    {
        System.out.print("Este programa calcula o resultado das notas do seu curso!!");
        
        System.out.println("Coloque a sua primeira nota:");
        nota1 = objetoScanner.nextFloat();
        System.out.println("Coloque a sua segunda nota:");
        nota2 = objetoScanner.nextFloat();
        System.out.println("Coloque a sua primeira nota:");
        nota1 = objetoScanner.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A sua media é: " + media);
        
        if(media > 10)
        {
            System.out.println("Media Positiva");
        }
        else
        {
            System.out.println("Média negativa");
        }
    }
}