class Tarefa
{
    String tarefa;
    
     //O modificador adicional static permite aceder diretamente a membros da classe em vez da instância
    static String[] listaTarefas = {"Limpar a sala", "Limpar o quarto", "Limpar a cozinha"};
    
    Tarefa(int paramTarefas)
    {
        if (paramTarefas >= 0 && paramTarefas < listaTarefas.length) {
            tarefa = listaTarefas[paramTarefas];
        } else {
            tarefa = "Tarefa invalida";
        }
    }
    
    String designacaoTarefa()
    {
        return "Tarefa a fazer -> " + tarefa;
    }
}