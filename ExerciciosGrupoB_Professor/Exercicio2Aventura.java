import java.util.Scanner;

class Exercicio2Aventura
{
    Scanner objetoScanner = new Scanner(System.in);
    
    String acaoJogador = new String();
    
    Exercicio2Aventura()
    {
        System.out.println("Colocar a vossa história");
        
        acaoJogador = objetoScanner.nextLine();
        
        /*
        if( acaoJogador.equalsIgnoreCase("norte") )
        {
            irParaNorte();
        }
        else if( acaoJogador.equalsIgnoreCase("sul") )
        {
            irParaSul();
        }
        */
        
       
        switch(acaoJogador)
        {
            case "norte":
                irParaNorte();
                break;
            case "sul":
                irParaSul();
                break;
            case "este":
                irParaEste();
                break;
            case "oeste":
                irParaOeste();
                break;
            default:
                System.out.println("O aventureiro ficou muito indeciso e morreu");
        }
       
       
       
    }
    
    
    void irParaNorte()
    {
        System.out.println("Contar o que aconteceu!");
        
        //Desenvolvimento da história!
    }
    
    
    void irParaSul()
    {
        System.out.println("Contar o que aconteceu!");
        
        
        //Desenvolvimento da história!
    }
    
    void irParaEste()
    {
        System.out.println("Contar o que aconteceu!");
        
        
        //Desenvolvimento da história!
    }
    
    void irParaOeste()
    {
        System.out.println("Contar o que aconteceu!");
        
        
        //Desenvolvimento da história!
    }
}