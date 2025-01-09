import java.util.Random;

class LancamentoDados {
    Random valorRandom = new Random();
    
    int dado1;
    int dado2;
    
    boolean solucao;
    
    LancamentoDados(){
         while(true)
         {
            dado1 = valorRandom.nextInt(6) + 1;
             dado2 = valorRandom.nextInt(6) + 1;
             System.out.println(dado1 + " " + dado2);
            
             solucao = (dado1 + dado2 == 7);
             
            if (solucao) {
                System.out.println("Ganhou, a soma é igual a 7");
                break;
            }
            else
            {
                System.out.println("Tente novamente");
            }
        }   
    }
    
    
}