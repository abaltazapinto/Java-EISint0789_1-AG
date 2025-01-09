import java.util.Random;
import java.util.ArrayList;

class Euromilhoes
{
    ArrayList<Integer> ListaNumeros = new ArrayList<>();
    Random numeroAleatorio = new Random();
    
    
    
    Euromilhoes()
    {
    for (int i = 1; i <= 50; i++){
        ListaNumeros.add(1);
    }
    
        int n1 = numeroAleatorio.nextInt(50) + 1;
        ListaNumeros.remove(n1);
        int n2 = numeroAleatorio.nextInt(50) + 1;
        ListaNumeros.remove(n2);
        int n3 = numeroAleatorio.nextInt(50) + 1;
        ListaNumeros.remove(n3);
        int n4 = numeroAleatorio.nextInt(50) + 1;
        ListaNumeros.remove(n4);
        int n5 = numeroAleatorio.nextInt(50) + 1;
        ListaNumeros.remove(n5);
        
        System.out.println("Os numeros vencedores sao: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " ");
    }
}