import java.util.Random;

class Exercicio5SlotMachine
{
    Random objetoAleatorio = new Random();

    
    Exercicio5SlotMachine()
    {
        String textoRolo1 = resultadoSimbolo();
        String textoRolo2 = resultadoSimbolo();
        String textoRolo3 = resultadoSimbolo();
        
        System.out.println( textoRolo1 + " - " + textoRolo2 + " - " + textoRolo3 );
        
        if( textoRolo1.equals(textoRolo2) && textoRolo1.equals(textoRolo3) )
        {
            System.out.println("Ganhou!");
        }
        else
        {
            System.out.println("Perdeu!");
        }
        
        /*
        if( textoRolo1.equals("Cereja") && textoRolo2.equals("Cereja") && textoRolo3.equals("Cereja") )
        {
            System.out.println("Ganhou!");
        }
        else if( textoRolo1.equals("Banana") && textoRolo2.equals("Banana") && textoRolo3.equals("Banana") )
        {
            System.out.println("Ganhou!");
        }
        else
        {
            System.out.println("Perdeu!");
        }
        */
       
    }
    
    String resultadoSimbolo()
    {
        int numeroRolo = objetoAleatorio.nextInt(5);
        
        String simbolo = new String();
        
        switch(numeroRolo)
        {
            case 0:
                simbolo = "Banana";
                break;
            case 1:
                simbolo = "Cereja";
                break;
            case 2:
                simbolo = "Diamante";
                break;
            case 3:
                simbolo = "Laranja";
                break;
            case 4:
                simbolo = "Cofre";
                break;       
        }
        
        /*
        if( numeroRolo == 0)
        {
            simbolo = "Banana";
        }
        else if( numeroRolo == 1)
        {
            simbolo = "Cereja";
        }
        else
        {
            simbolo = "Diamante";
        }
        */
        
        return simbolo;
    }
}