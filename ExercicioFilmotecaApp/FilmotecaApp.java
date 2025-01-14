import java.util.ArrayList;
import java.util.Scanner;

class FilmotecaApp
{
    ArrayList<String> films = new ArrayList<>();
    Scanner objetoScanner = new Scanner(System.in);
    
    FilmotecaApp()
    {
        System.out.print("Bem vindo à Filmoteca App");
        
    }
    
    void Filmoteca()
    {
        System.out.println("------------------------------------------");
        System.out.println("1 - Adicionar novo filme");
        System.out.println("2 - Mostrar todos os filmes de um genero escolhido");
        System.out.println("3 - Apresentar a média de avaliaões de todos os filmes");
        System.out.println("------------------------------------------");
    }
    
    void AdicionarFilme()
    {
        String filme;
        
        System.out.println("Que filme deseja adicionar?");
        filme = objetoScanner.nextLine();
        
        films.add(filme);
        
    }
    
    void escolhaGenero()
    {
        for(int i = 0; i < films.size(); i++)
        {
            System.out.println(films.get(i));
        }
    }
    
    void listeTodosFilmes()
    {
        for(int i = 0; i < films.size(); i++)
        {
            System.out.println(films.get(i));
        }
    }
    
    void mediaAvaliacoes()
    {
        
    }
}