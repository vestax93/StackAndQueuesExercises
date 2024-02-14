import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_01_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inicijalizacija skenera za ucitavanje podataka
        String[] numbers = scanner.nextLine().split("\\s+"); //ucitavamo brojeve sa konzole
        //i razdvajamo brojeve (sklanjamo razmake)

        ArrayDeque<Integer> stack = new ArrayDeque<>(); //definicija i inicijaliacija stack-a
        for(String number : numbers){ //prolazimo kroz niz Stringova koji su zapravo upisani brojevi sa konzole
            stack.push(Integer.valueOf(number)); //pretvaramo String -> int i pushujemo na stack
        }
        for(Integer num : stack){
            System.out.print(stack.pop() + " "); //izbacujemo i ispisujemo elemente iz stacka ->
            //izlaze obrnutim redosledom u odnosu na onaj kojim su usli
        }
    }
}
