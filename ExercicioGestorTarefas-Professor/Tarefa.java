import java.util.Scanner;

class Tarefa
{
    Scanner objetoScanner = new Scanner(System.in);
    
    String designacao;
    String prioridade;
    
    
    Tarefa()
    {
        System.out.println("Qual a sua proxima tarefa");
        
        designacao = new String("Sem nome");
        
        prioridade = new String("Baixa");
        
        
        
    }
    
    void informacaoCompleta()
    {
        System.out.println("Nome da tarefa:" + designacao + " | Prioridade:" + prioridade);
    }
    
    
}