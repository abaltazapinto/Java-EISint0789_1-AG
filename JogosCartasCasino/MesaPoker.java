import java.util.ArrayList;
import java.util.Random;

class MesaPoker
{
    ArrayList<Carta> baralhoPoker = new ArrayList<>();
    Random instanciaRandom = new Random();
    
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
                 Carta instanciaCarta = new Carta(i,j);
                 //instanciaCarta.naipe = Carta.listaNaipes[i];
                 //instanciaCarta.rank = Carta.listaRanks[j];
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
    
    void comprarCarta()
    {
        comprarCarta(1);    
    }
    
    void comprarCarta(int numeroDeCartasAComprar)
    {
        
        for (int i=0; i < numeroDeCartasAComprar; i++)
        {
            if (baralhoPoker.size() > 0 )
            {
                int indexQueSaiuNaSorte = instanciaRandom.nextInt(baralhoPoker.size());
                Carta cartaComprada = baralhoPoker.get(indexQueSaiuNaSorte);
                System.out.println( cartaComprada.designacaoCompleta() );
                baralhoPoker.remove(indexQueSaiuNaSorte);
            }
            else
            {
                System.out.println("Já não há mais cartas no baralho!");
                break;
            }
        }
    }
    

}