import java.util.Random;

class Exercicio5Slot {
    int randomNumber1 = (int)(Math.random() * 2) + 1;
    int randomNumber2 = (int)(Math.random() * 2) + 1;
    
 Exercicio5Slot(){
     if(randomNumber1 == 1 && randomNumber2 == 1)
     {
         System.out.println("Cereja-Cereja-Cereja");
         System.out.println("Você ganhou!!");
     }
     else if (randomNumber2 == 2 && randomNumber1 ==2)
     {
         System.out.println("Banana-Banana-Banana");
         System.out.println("Você ganhou!!");
     }
     else 
     {
         System.out.println("Banana-Cereja-Banana");
         System.out.println("Você perdeu!!");
     }
 }
}