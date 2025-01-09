import java.util.ArrayList;
import java.util.Random;

class gestorTarefas {
    ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
    Random instanciaRandom = new Random();
        
    gestorTarefas()
    {
         System.out.println("Bem vindo! Ao nosso gestor de tarefas");
         inicializarTarefas();
         listarTarefas();
    }
    
    // Listar as tarefas a partir da lista estatica de Tarefa
    void inicializarTarefas() 
    {
        for (int i = 0; i < Tarefa.listaTarefas.length; i++) {
            listaDeTarefas.add(new Tarefa(i));
        }
    }
    
    void listarTarefas() 
    {
        System.out.println("\nTarefas disponiveis:");
        
        for(int i = 0; i < listaDeTarefas.size(); i++)
        {
            System.out.println((i + 1) + ". " + listaDeTarefas.get(i).designacaoTarefa());
        }
    }
    
    void selecionarTarefaAleatoria() 
    {
        if (listaDeTarefas.size() > 0)
        {
            int indexSorteado = instanciaRandom.nextInt(listaDeTarefas.size());
            Tarefa tarefaSelecionada = listaDeTarefas.get(indexSorteado);
            System.out.println("\n Tarefa selecionada: " + tarefaSelecionada.designacaoTarefa());
            listaDeTarefas.remove(indexSorteado);
        } else {
            System.out.println("Todas as tarefas foram concluídas!");
        }
    }
}