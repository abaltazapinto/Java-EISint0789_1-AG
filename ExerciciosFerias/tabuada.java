import java.util.Scanner;

class tabuada{
    Scanner objetoScanner = new Scanner(System.in);
    
    String numeroTabuada;
    static String[] listaNumeros = {"1","2","3","4","5","6","7","8","9"}
    
    NumeroTabuada(int paramNumero)
    {
         numero = listaNumeros[paramNumero + 1];   
    }
    
    tabuada(){
        
        boolean isValid = false;
        
        while (!isValid) {
            System.out.println("Por favor indique que um número, para se calcular a sua tabuada?");
            String input = objetoScanner.nextLine();
            
        try {
            double numeroTabuada = Double.parseDouble(input);
            System.out.println("You entered a valid number: " + numeroTabuada);
            isValid = true;
            
        } catch (NumberFormatException e) {
         System.out.println("Input invalido!!! Insira um numero por favor");
         objetoScanner.nextLine();
         
        }
        }
    }
    
    String designacaoCompleta() {
        return "1 * " + double + "= " + double * 1;
    }
}