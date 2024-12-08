import java.util.Scanner;

class Exercicio2Aventura 
{
    Scanner objetoScanner = new Scanner(System.in);
    String escolha = new String();
    
    
    Exercicio2Aventura()
    {
        System.out.println("Bem-vindo à aventura interativa!");
        System.out.println("Você é Ariana, uma arqueóloga corajosa que explora as ruínas perdidas do Vale da Neblina, "
        + "um lugar misterioso envolto em brumas eternas.\n"
        + "O local é cheio de passagens ocultas, inscrições antigas e rumores de uma joia lendária que "
        + "concede imenso poder a quem a encontrar.\n");
        System.out.println("Você está no centro das ruínas. À sua frente  há quatros caminhos:");
        System.out.println("NORTE: Um portal de pedra com símbolos brilhantes");
        System.out.println("SUL: Uma escadaria que desce para a escuridão");
        System.out.println("ESTE: Um corredor iluminado por tochas antigas.");
        System.out.println("OESTE: Uma trilha que leva a um bosque sombrio.\n");
        
        escolha = objetoScanner.nextLine().toLowerCase();
        
        switch(escolha) {
            case "norte":
                System.out.println("\nVocê atravessa o portal de pedra e é transportada para um salão mágico.");
                System.out.println("Uma voz misteriosa ecoa: 'Prove sua sabedoria para avanar.'");
                System.out.println("Uma série de enigmas aparece diante de você. Sua jornada está apenas comecando!");
                break;
            case "sul":
                System.out.println("\nVocê desce a escadaria e se encontra em uma câmara subterrânea.");
                System.out.println("A sala é preenchida com sarcófagos antigos. De repente, um deles comea a se abrir...");
                System.out.println("Sente-se que algo muito sério está acordando");
                break;
            case "este":
                System.out.println("\nVocê segue pelo corredor iluminado por tochas.");
                System.out.println("Ao final, encontra um salão repleto de tesouros brilhantes");
                System.out.println("No entanto, uma armadilha e tens de dicidir rapidamente o que fazer!");
                break;
            case "oeste":
                System.out.println("\nVocê entra no bosque sombrio, onde a neblina é densa.");
                System.out.println("Entre as árvores, você ouve sussuros estranhos e percebe que está sendo observada");
                System.out.println("Uma sombra se move rapidamente na tua direcão");
                break;
            default:
                System.out.println("\nVocê hesitou e permenaceu no mesmo lugar. Talvez seja hora de tomar uma decisão mais ousada.");
        }
        System.out.println("\nObrigado por jogar! Sua aventura continua...");
        objetoScanner.close();
    }
}