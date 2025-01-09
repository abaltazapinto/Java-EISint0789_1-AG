class Carta
{
    String naipe;
    String rank;

    //O modificador adicional static permite aceder diretamente a membros da classe em vez da instância
    static String[] listaNaipes = {"Espadas","Paus","Copas","Ouros"};
    static String[] listaRanks = {"Ás","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
    
    Carta(int paramNaipe, int paramRank)
    {
        naipe = listaNaipes[paramNaipe];
        rank = listaRanks[paramRank];
    }
    // Assinatura 2
    Carta(String paramNaipe, String paramRank)
    {
        naipe = paramNaipe;
        rank = paramRank;
    }
    String designacaoCompleta()
    {
        return rank + " de " + naipe;
    }
}