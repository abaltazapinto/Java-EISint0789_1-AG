import java.util.Scanner;
import java.util.ArrayList;

/*
 * 1. Simulação de Notas Escolares
Objetivo:
Desenvolver um programa que permita calcular a média de notas de um aluno e indicar se ele passou ou reprovou.

Requisitos:

Solicitar ao utilizador o nome do aluno.
Pedir ao utilizador três notas (valores entre 0 e 20).
Calcular a média das três notas.
Se a média for maior ou igual a 10, o programa deverá indicar que o aluno passou. Caso contrário, deverá indicar que reprovou.
 */

class simulacaoNotasEscolares{
    Scanner objetoScanner = new Scanner(System.in);
    String nome = new String();
    ArrayList<Integer> listaNotas = new ArrayList<>();
    
    int somatorio;
    
    simulacaoNotasEscolares()
    {
            System.out.println("Qual o seu nome");
            nome = objetoScanner.nextLine();
            int nota;
            System.out.println("Indique por favor as suas ultimas 3 notas");
            for (int i = 0 ; i < 3 ; i++)
            {
                System.out.println("Por favor indique a sua "+ (i + 1) + " nota ");
                nota = objetoScanner.nextInt();
                
                listaNotas.add(nota);
                somatorio += nota;
            }
             
            float media = somatorio / listaNotas.size();
            
            
            String resposta = (media > 9) ? 
                "Passou"
                : "Reprovou";
            System.out.println(resposta);
                
            System.out.println("A media de notas é: " + media);
        
        
    }
}