import java.util.*;
import java.util.Scanner;

class LancamentoDados {
    Random objetoAleatorio = new Random();
    Scanner objetoInput = new Scanner(System.in);
    
    int numeroAleatorio = objetoAleatorio.nextInt(10) + 2;
    
       
    
    LancamentoDados(){
        while (true)
        {
            System.out.println("Tente adivinhar o numero que irá sair no lancamento dos dados");
            System.out.println("O numero menor que poderá sair é 2. E o máximo será 12");
             
            try 
            {
                
                int numeroUser = objetoInput.nextInt();
                
                
                while (true)
                {
                    if(numeroAleatorio == numeroUser)
                    {
                        System.out.println("Acertou em cheio no numero Aleatorio");
                        System.out.println("Ganhou 100 euros");
                        break;
                    }
                    else if(numeroAleatorio > numeroUser)
                    {
                        System.out.println("O numero Aleatorio é maior");
                        System.out.println("Tem de pagar 10 euros");
                    }
                    else
                    {
                        System.out.println("O numero Aleatorio é menor");
                        System.out.println("Tem de pagar 10 euros");
                    }
                    
                    numeroUser = objetoInput.nextInt();
                    
                }
                System.out.println("colocou " + numeroUser);
                System.out.println("O numero Aleatorio que saiu " + numeroAleatorio);
                break;
                
            }
            catch(Exception erro)
            {
                objetoInput.nextLine();
                System.out.println("Não colocou um valor correcto");
            }
        }       
    }
}