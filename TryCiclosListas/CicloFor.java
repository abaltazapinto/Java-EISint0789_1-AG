import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

class CicloFor
{
    ArrayList<String> listaDeNomes = new ArrayList<>();
    
    CicloFor()
    {
         int [] nums = {1,2,3,5};
         for(int i = 0; i < nums.length; i++)
         {
             System.out.println(nums[i] + " ");
         }
         
         System.out.println(" ");
         
         List<Integer> numsList = Arrays.asList(1,2,4,5,6);
         
         numsList.forEach(num -> System.out.println(num + " "));
         
         System.out.println("");
         
         listaDeNomes.add("Manuel");
         listaDeNomes.add("André");
         listaDeNomes.add("Vitor");
         System.out.println("");
         System.out.println(listaDeNomes.size());
         System.out.println("");
         System.out.println(listaDeNomes);
         System.out.println("");
         System.out.println(listaDeNomes.get(1));
         System.out.println("");
         listaDeNomes.forEach(nome -> System.out.println(nome + " "));
         System.out.println("");
         
         listaDeNomes.remove(2);
         System.out.println("");
         System.out.println(listaDeNomes.size());
         System.out.println("");
         System.out.println(listaDeNomes);
         System.out.println("");
         for(int num : nums) {
             System.out.println(num + " ");
         }
         
         System.out.println(" ");
         int [] numeros = {9, 7, 6 ,5, 7};
         
         List<Integer> numerosList = Arrays.asList(20,19,18,17,16);
         
         numerosList.forEach(numero -> System.out.println(numero + "fds "));
         
         System.out.println(" ");
         Arrays.stream(numeros).forEach(num -> System.out.println(num + "wow "));
         
         System.out.println("");
         
         for(int numero : numeros) {
             System.out.println(numero + "ole");
         }
         
         System.out.println("");
         Iterator<Integer> iterator = numerosList.iterator();
         
         while(iterator.hasNext()) {
             System.out.println(iterator.next() + " ");
         }
         
         System.out.println("");
         
         Arrays.stream(nums)
             .filter(num -> num % 2 == 0)
             .forEach(num -> System.out.println(num + " "));
         
         Arrays.stream(numeros)
             .filter(num -> num % 2 == 0)
             .map(num -> num * 2)
             .forEach(num -> System.out.println(num + " "));
    
    }
}