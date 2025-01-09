import java.util.ArrayList;
import java.util.Random;

class FrequenciaVogais
{
    ArrayList<String> listaLetras = new ArrayList<>();
    Random numeroRandom = new Random();
    int numero;
    int[] count = new int[5];
    
    FrequenciaVogais()
    {
    listaLetras.add("A");
    listaLetras.add("E");
    listaLetras.add("I");
    listaLetras.add("O");
    listaLetras.add("U");
    
        
        for(int i = 0; i < 20; i++) 
        {
            numero = numeroRandom.nextInt(5);
            System.out.print(listaLetras.get(numero)+ " ");
            count[numero]++;
        }
        
        System.out.println(listaLetras);
        
        for (int i = 0; i < listaLetras.size(); i++) {
            System.out.println(listaLetras.get(i) + " saiu " + count[i] + " vezes");
        }
        
        
    }
}