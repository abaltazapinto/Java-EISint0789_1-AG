import java.util.Scanner;

class IVA {
    Scanner objetoScanner = new Scanner(System.in);
    
    int precoProduto1;
    String resposta = new String();
    String resposta2 = new String();
    
    IVA(){
        while (true) 
        {
            System.out.println("Qual é o preco do produto escolhido ?");
            int precoProduto1 = objetoScanner.nextInt();
            objetoScanner.nextLine();
            
            System.out.println("O preco do produto escolhido já têm o IVA incluído ? (Sim/Nao)");
            String resposta = objetoScanner.nextLine().toLowerCase();
            String precoTotal = resposta.equals("sim") 
                ? "O preco Total do Produto sem iva seria: " + (double) (precoProduto1 / 1.23)
                : resposta.equals("nao")
                ? "O preco total do produto será: " + (float) (precoProduto1 * 1.23)
                : "Resposta Inválida!";
            System.out.println(precoTotal);
            
            System.out.println("Deseja saber mais informacoes sobre outro produto ? (Sim/Nao)");
            resposta2 = objetoScanner.nextLine().toLowerCase();
            
            if (resposta2.equals("sim")){
                continue;
            }
            else
            {
                System.out.println("Obrigado pela sua visita !!!");
                break;
            }
            
        }
    }
}