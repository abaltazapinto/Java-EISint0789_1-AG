class Carta
{
    String naipe;
    String rank;

    //O modificador adicional static permite aceder diretamente a membros da classe em vez da instância
    static String[] listaNaipes = {"Espadas","Paus","Copas","Ouros"};
    static String[] listaRanks = {"Ás","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
    
    Carta()
    {
    
    }
    
    String designacaoCompleta()
    {
        return rank + " de " + naipe;
    }
}