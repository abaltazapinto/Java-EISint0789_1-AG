import java.util.ArrayList;
import java.util.Scanner;

class FilmotecaApp
{
    Filme objetoFilme;
    
    ArrayList<Filme> filmes = new ArrayList<>();
    Scanner objetoScanner = new Scanner(System.in);
    
    FilmotecaApp()
    {
        System.out.println("Bem vindo à Filmoteca App");
        Filmoteca();
    }
    
    void Filmoteca()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Adicionar novo filme");
        System.out.println("2 - Mostrar todos os filmes de um genero escolhido");
        System.out.println("3 - Apresentar a média de avaliaões de todos os filmes");
        System.out.println("----------------------------------------------------------");
        
        int escolhaDoUtilizador = objetoScanner.nextInt();
        // como os outros
        objetoScanner.nextLine();
        
        if(escolhaDoUtilizador == 1)
        {
            AdicionarFilme();
        }else if(escolhaDoUtilizador == 2)
        {
            escolhaGenero();
        }else if(escolhaDoUtilizador == 3)
        {
            mediaAvaliacoes();
        }else{
            System.out.println("Tem de escolher entre 1 e 3 inclusive, por favor");
        }
        
    }
    
    void AdicionarFilme()
    {
        objetoFilme = new Filme();
        
        System.out.println("Que filme deseja adicionar?");
        objetoFilme.nome = objetoScanner.nextLine();
        System.out.println("Em que categoria de filmes se enquadra este filme??");
        objetoFilme.genero = objetoScanner.nextLine();
        System.out.println("De 0 a 5, qual será classificaão que dará a este filme");
        objetoFilme.avaliacao = objetoScanner.nextDouble();
        filmes.add(objetoFilme);
        
        Filmoteca();
    }
    
    void escolhaGenero()
    {
        System.out.println("Qual o genero que desejas procurar? (Ex: Accao | Comedia | Terror, Outros...");
        String generoEscolhido = objetoScanner.nextLine();
        
        ArrayList<Filme> filmesDoGenero = new ArrayList<>();
        
        for(int i = 0; i < filmes.size(); i++)
        {    
            if(filmes.get(i).genero.equalsIgnoreCase(generoEscolhido))
            {
                 filmesDoGenero.add(filmes.get(i));   
            }
        }
        
        if (filmesDoGenero.isEmpty()) {
            System.out.println("Nenhum filme encontrado no gênero: " + generoEscolhido);
        } else {
            System.out.println("Filmes encontrados no gênero " + generoEscolhido + ":");
            for(int i = 0; i < filmesDoGenero.size();i++)
            {
                filmesDoGenero.get(i).informacaoCompletaFilme();
            }
        }
        
        Filmoteca();
    }
    
    void listeTodosFilmes()
    {
        if(filmes.size() == 0)
        {
            System.out.println("Não há filmes a apresentar");
        }
        
        System.out.println("\nFilmes disponíveis");
        
        for(int i = 0; i < filmes.size(); i++)
        {
            System.out.println(filmes.get(i));
        }
        
    }
    
    void mediaAvaliacoes()
    {
        double soma = 0.0;
        int quantidade = 0;
        double media;
        
        for(int i = 0; i < filmes.size(); i++)
        {
            soma += filmes.get(i).avaliacao;
            quantidade++;
        }
        
        if (quantidade > 0)
        {
            media = soma / quantidade;
            System.out.println("A média de todos os filmes é: " + media);
        } else {
            System.out.println("Não há filmes para calcular a média.");
        }
        
        Filmoteca();
    }
}