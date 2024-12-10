import java.util.Random;
class professorExercicio5Slot 
{
    Random numeroAleatorio = new Random();
    
    int numeroRolo1;
    int numeroRolo2;
    int numeroRolo3;
    
    String textoRolo1 = new String();
    String textoRolo2 = new String();
    String textoRolo3 = new String();
    professorExercicio5Slot() 
    {
        numeroRolo1 = numeroAleatorio.nextInt(2);
        numeroRolo2 = numeroAleatorio.nextInt(2);
        numeroRolo3 = numeroAleatorio.nextInt(2);
        
        if(numeroRolo1 == 0)
        {
            textoRolo1 = "Banana";
        }
        else
        {
            textoRolo1 = "Cereja";
        }
        
        if(numeroRolo2 == 0)
        {
            textoRolo2 = "Banana";
        }
        else
        {
            textoRolo2 = "Cereja";
        }
        
        if(numeroRolo3 == 0)
        {
            textoRolo3 = "Banana";
        }
        else
        {
            textoRolo3 = "Cereja";
        }
        
        System.out.println(textoRolo1 + " - " + textoRolo2 + " - " + textoRolo3);
    }
    
}