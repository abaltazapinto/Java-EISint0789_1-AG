import java.util.ArrayList;
import java.util.Scanner;

class AppGestorTarefas
{
    Tarefa objetoTarefa;
    
    ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    Scanner objetoScanner = new Scanner(System.in);
    
    AppGestorTarefas()
    {
        System.out.println("Bem-vindo ao gestor de tarefas!");
        escolhaDeOpcoes();
    }
    void escolhaDeOpcoes()
    {
        System.out.println("---------------------------------");
        System.out.println("Por favor escola o número de opcões:");
        System.out.println("1 - Criar nova Tarefa");
        System.out.println("2 - Listar todas as tarefas");
        System.out.println("3 - Listar apenas tarefas urgentes");
        System.out.println("---------------------------------");
        
        int escolhaDoUtilizador = objetoScanner.nextInt();
        //Evitar o problema do próximo input
        objetoScanner.nextLine();
        
        if(escolhaDoUtilizador == 1)
        {
            criarNovaTarefa();
        }
        if(escolhaDoUtilizador == 2)
        {
            listarTodasTarefas();
        }
        if(escolhaDoUtilizador == 3)
        {
            listarTarefasUrgentes();
        }
        
        
    }
    
    void criarNovaTarefa()
    {   
        objetoTarefa = new Tarefa();
        System.out.println("Por favor coloque a designacao da tarefa:");
        objetoTarefa.designacao = objetoScanner.nextLine();
        
        System.out.println("Por favor coloque a prioridade");
        objetoTarefa.prioridade = objetoScanner.nextLine();
        
        listaTarefas.add(objetoTarefa);
        
        escolhaDeOpcoes();
    }
    
    void listarTodasTarefas()
    {
        
        
        if(listaTarefas.size() == 0 )
        {
            System.out.println("Ainda nao ha tarefas!");
        }
        
        for(int i=0; i < listaTarefas.size();i++)
        { 
            listaTarefas.get(i).informacaoCompleta();
        }
        
        escolhaDeOpcoes();
    }
    
    void listarTarefasUrgentes()
    {
        boolean jaApareceuUmaUrgente = false;
        
        for(int i =0; i <listaTarefas.size();i++)
        {
            if(listaTarefas.get(i).prioridade.equalsIgnoreCase("Urgente") )
            {
                jaApareceuUmaUrgente = true;
                System.out.println(listaTarefas.get(i).designacao);
            }
            
        }
        if(!jaApareceuUmaUrgente)
        {
            System.out.println("Não existem tarefas urgentes");
        }
        escolhaDeOpcoes();
    }
}