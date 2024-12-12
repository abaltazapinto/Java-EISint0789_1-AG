import java.util.Scanner;
class Exploracao{
    
    Scanner objetoInput = new Scanner(System.in);
    
    int numeroInteiro;
    
    Exploracao()
    { 
         while(true)
         {
            System.out.println("Por favor escreva um número inteiro");
            try
            {
                 numeroInteiro = objetoInput.nextInt();
                 System.out.println("colocou " + numeroInteiro);
                 break;
            }
            catch(Exception erro)
            {
                objetoInput.nextLine();
                System.out.println("Não colocou um valor correcto");
                    // System.out.println(erro.toString());
                    // erro.printStackTrace();
            }
         }
         System.out.println("Escreveu corretamente um valor inteiro");
    }
}