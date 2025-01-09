import java.util.ArrayList;

class MesaPoker
{
    ArrayList<Carta> baralhoPoker = new ArrayList<>();
    
    MesaPoker()
    {
        System.out.println("Entrou numa mesa de Poker");
        fazerBaralho();
    }
    
    void fazerBaralho()
    {
        int numeroDeNaipes = Carta.listaNaipes.length;
        int numeroDeRanks = Carta.listaRanks.length;
        
        for(int i=0; i < numeroDeNaipes; i++)
        {
            for(int j=0; j < numeroDeRanks; j++)
            {
                 Carta instanciaCarta = new Carta();
                 instanciaCarta.naipe = Carta.listaNaipes[i];
                 instanciaCarta.rank = Carta.listaRanks[j];
                 baralhoPoker.add(instanciaCarta);
            }
        }
    }
    
    void listarBaralho()
    {
        for(int i=0; i<baralhoPoker.size(); i++)
        {
            System.out.println( baralhoPoker.get(i).designacaoCompleta() );
        }
    }
    
    
    

}