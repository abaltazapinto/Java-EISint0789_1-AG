import java.util.Scanner;
import java.util.Random;

class ResultadoFutebol {
    Scanner objetoScanner = new Scanner(System.in);
    Random resultadoAleatorio = new Random();
    
    String escolha = new String();
    int golosMarcados;
    
    CapitalizeFirstLetter cfl = new CapitalizeFirstLetter();
    
    ResultadoFutebol() {
        
        System.out.println("Informe-me qual o seu clube de futebol de forma a eu poder simular o próximo resultado?");
        escolha = objetoScanner.nextLine().toLowerCase();
        int golosMarcadosCasa = resultadoAleatorio.nextInt(5);
        
        switch(escolha) {
            case "porto":
                System.out.println("Nome do clube: " + cfl.capitalizeFirstLetter(escolha)
                + "neste jogo consegui marcar " + golosMarcadosCasa);
                break;
            case "benfica":
                System.out.println("Nome do clube: " + cfl.capitalizeFirstLetter(escolha) 
                + " neste jogo consegui marcar " + golosMarcadosCasa);
                break;
            case "sporting":
                System.out.println("Nome do clube: " + cfl.capitalizeFirstLetter(escolha)
                + "neste jogo consegui marcar " + golosMarcadosCasa);
                break;
            default:
                System.out.println("Nome do clube: " + cfl.capitalizeFirstLetter(escolha)
                + ", neste jogo conseguiu marcar " + golosMarcadosCasa);
                break;
        }
        
        int golosMarcadosFora = resultadoAleatorio.nextInt(5);
        
        System.out.println("O adversário conseguiu marcar : " + golosMarcadosFora);
        
        String resultado =  golosMarcadosCasa > golosMarcadosFora
            ? cfl.capitalizeFirstLetter(escolha) + " Ganhou o jogo!!" 
            : golosMarcadosCasa == golosMarcadosFora 
                ? cfl.capitalizeFirstLetter(escolha) + " Empatou o jogo" 
                : cfl.capitalizeFirstLetter(escolha) + " Perdeu o jogo"; 
        System.out.println(resultado);
        
        
        
    }
    
    public class CapitalizeFirstLetter {
        public String capitalizeFirstLetter(String Input) {
            if (Input == null || Input.isEmpty()) {
                return Input;
            }
            return Input.substring(0,1).toUpperCase() + Input.substring(1);
         }
    }
}