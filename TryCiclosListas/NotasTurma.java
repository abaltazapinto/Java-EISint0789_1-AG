import java.util.ArrayList;
import java.util.Scanner;

class NotasTurma
{
    ArrayList<String> listaAlunos = new ArrayList<>();
    Scanner objetoScanner = new Scanner(System.in);
    ArrayList<Integer> listaNotas = new ArrayList<>();
    
    int somatorio = 0;
    NotasTurma()
    {
        listaAlunos.add("André");
        listaAlunos.add("Francisco");
        listaAlunos.add("Gertrudes");
        listaAlunos.add("Gervásio");
        listaAlunos.add("Nicolina");
        
        listaAlunos.forEach(aluno -> System.out.print(aluno + " "));
         // System.out.println(listaAlunos);
        
        //for (String aluno : listaAlunos)
        //{
          //  System.out.println(aluno);
        //}
        
        int nota;
        
        for(int i = 0; i < listaAlunos.size(); i++)
        {
            System.out.print("Por favor coloque a nota do aluno " + listaAlunos.get(i) + ":");
            nota = objetoScanner.nextInt();
            listaNotas.add(nota);
        }
        
        for(int i=0; i < listaNotas.size(); i++)
        {
            somatorio += listaNotas.get(i);
        }
        
        float media = somatorio / listaNotas.size();
        
        System.out.println("A médias de notas é: " + media);
        
        // System.out.println(listaNotas);
    }
}