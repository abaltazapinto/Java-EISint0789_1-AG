import java.util.Random;

class Exercicio5Stor 
{
    Random objetoAleatorio = new Random();
    
    int numeroRolo;
    
    String textoRolo1 = new String();
    String textoRolo2 = new String();
    String textoRolo3 = new String();
    
    Exercicio5Stor() 
    {
        textoRolo1 = resultadoSimbolo();
        textoRolo2 = resultadoSimbolo();
        textoRolo3 = resultadoSimbolo();
        /*
        if(textoRolo1 == textoRolo2 && textoRolo2 == textoRolo3 )
        {
            System.out.println("you won the machine lottery");
        }
        */
       
       System.out.println(textoRolo1 + " - " + textoRolo2 + " - " + textoRolo3);
       
       if( textoRolo1.equals(textoRolo2) && textoRolo1.equals(textoRolo3) )
       {
           System.out.println("Ganhou");
       }
       else
       {    
           System.out.println("Perdeu");
       }
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
        if (numeroRolo == 0)
        {
            simbolo = "Banana";
           
        }
        else if(numeroRolo == 1)
        {
            simbolo = "Diamante";
        }
        else
        {
            simbolo = "Cereja";
            
        }*/
        
         return simbolo;
    }
    
}