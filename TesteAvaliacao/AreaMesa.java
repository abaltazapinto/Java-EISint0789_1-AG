import java.util.Scanner;

class AreaMesa
{
    Scanner objetoScanner = new Scanner(System.in);
    
    float comprimentoMesaCentimetros;
    float larguraCentimetros;
    
    int area;
    
    AreaMesa()
    {   
        System.out.println("Vamos calcular o comprimento da tua mesa de jantar!!!");
        System.out.println("Indique o comprimento da mesa");
        comprimentoMesaCentimetros = objetoScanner.nextFloat();
        
        System.out.println("Agora, indique a largura da mesa.");
        larguraCentimetros = objetoScanner.nextFloat();
        
        if(comprimentoMesaCentimetros < larguraCentimetros)
        {
            System.out.println("Trocou os valores de largura com comprimento!! Mas nao ha problema :)");
        }
        
        area = (int)(comprimentoMesaCentimetros * larguraCentimetros);
        
        System.out.println("A Area da tua mesa é: " + area + "cm2!");
        
            
    }
    
}