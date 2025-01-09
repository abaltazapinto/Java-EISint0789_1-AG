import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

class ContagemDeNumerosEmArrayList{
    ArrayList<Integer> listaDeNumeros = new ArrayList<>();
    Scanner objetoScanner = new Scanner(System.in);
    int countPares = 0;
    int countImpares = 0;
    
    ContagemDeNumerosEmArrayList()
    {
        listaDeNumeros.add(5);
        listaDeNumeros.add(6);
        listaDeNumeros.forEach(num -> System.out.println(num + " "));
        
        for (int i = 0; i < listaDeNumeros.size() ; i++)
        {
            int numero = objetoScanner.nextInt();
            listaDeNumeros.add(numero);
            
            if (isPar(numero))
            {
                countPares++;
                System.out.println("e par");
            }
            else if ((numero ))
            {
                countImpares++;
                System.out.println("e impar");
            }
            
        }
        
        System.out.println("Números pares: " + countPares);
        System.out.println("Números ímpares: " + countImpares);
            
    }
    
    boolean isPar(int numero) {
        return numero % 2 == 0;
    }
}