import java.util.ArrayList;

class OperacoesListas
{
    ArrayList<String> listaCidades = new ArrayList<>();
    ArrayList<Integer> ListaNumeros = new ArrayList<>();
    ArrayList<String> Lista2 = new ArrayList<>();
    
    OperacoesListas()
    {
        
        ListaNumeros.add(9);
        ListaNumeros.add(9);
        listaCidades.add("Porto");
        listaCidades.add("Braga");
        listaCidades.add("Viseu");
        listaCidades.add("Amarante");
        listaCidades.add("Foz Côa");
        
        System.out.println(listaCidades);
        listaCidades.remove("Amarante");
        System.out.println(listaCidades);
        listaCidades.remove(2);
        System.out.println(listaCidades);
        System.out.println(listaCidades.size());
        
        // O metodo get() permanite lear a informacao de um determinado elemento da lista (index)
        
        System.out.println( (listaCidades.get(0) ));
        
        // o método set() permite alterar um valor de um determinado elemento(através do index)
        listaCidades.set(1, "Guimarães");
        System.out.println(listaCidades);
        
        
        // Exemplo de ciclo a percorrer a lista
        for(int i=0; i < listaCidades.size(); i++)
        {
            System.out.println("A cidade na posicao " + i + " " + listaCidades.get(i));
            
        }
    }
}