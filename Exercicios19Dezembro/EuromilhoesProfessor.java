import java.util.Random;
import java.util.ArrayList;

class EuromilhoesProfessor
{
    ArrayList<Integer> tombolaNumeros = new ArrayList<>();
    ArrayList<Integer> tombolaEstrelas = new ArrayList<>();
    
    Random objetoAleatorio = new Random();
    
    
    EuromilhoesProfessor()
    {   
        // Prencher a tombola de numeros
        for(int i = 0 ; i < 50; i++){
           tombolaNumeros.add(i + 1); 
        }        
        
        
        System.out.println("A chave dos números do Euromilhoes é a seguinte:");
        for(int i = 0; i<5; i++)
        {
            int resultadoAleatorio  = objetoAleatorio.nextInt(tombolaNumeros.size());
            System.out.println(tombolaNumeros.get(resultadoAleatorio));
            tombolaNumeros.remove(resultadoAleatorio);
        }
        
        //Preencher a tombola de estrelas
        for(int i = 0 ; i < 12; i++){
           tombolaEstrelas.add(i + 1); 
        }   
        System.out.println("A chave das estrelas do Euromilhoes é a seguinte:");
        // Saida da estrela e a sua remocão da lista
        for(int i = 0; i<2; i++)
        {
            int resultadoAleatorio  = objetoAleatorio.nextInt(tombolaEstrelas.size());
            System.out.println(tombolaEstrelas.get(resultadoAleatorio));
            tombolaEstrelas.remove(resultadoAleatorio);
        }
        
    }
    
}