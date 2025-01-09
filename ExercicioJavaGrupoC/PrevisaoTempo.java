import java.util.Random;
import java.util.Scanner;

class PrevisaoTempo {
    Random diaAleatorio = new Random();
    Scanner objetoInput = new Scanner(System.in);
    
    PrevisaoTempo() 
    {
        
        System.out.println("Quantos dias pretende a previsão da temperatura?");
        int numeroDeDias = objetoInput.nextInt();
        previsao(numeroDeDias);
    }
    
    void previsao(int number)
    {   
        for(int i = 0; i < number; i++)
        {
            System.out.println("Dia: " + (i + 1) + ": " + clima());
        }
    }
    
    String clima()
    {
        int previsaoAleatoria = diaAleatorio.nextInt(4);
        
        switch(previsaoAleatoria)
        {
            case 1:
                return "Chuva";
            case 2:
                return "Nublado";
            case 3:
                return "Sol";
            case 4:
                return "Neve";
            default:
                return "Tempestade";
        }       
    }
}