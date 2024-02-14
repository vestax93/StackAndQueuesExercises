import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inic. scanner-a
        String[] input = scanner.nextLine().split(" ");

        int countToPush = Integer.parseInt(input[0]); //broj elemenata za ubacivanje u stack
        int countToPop = Integer.parseInt(input[1]); //broj elemenata za izbacivanje iz stacka
        int element = Integer.parseInt(input[2]); //element koji cemo traziti u stacku nakon ubacivanja i izbacivanja

        String[] numbers = scanner.nextLine().split("\\s+"); //ucitavanje brojeva za dodavanje

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int min = Integer.MAX_VALUE; //inicijalizacija minimuma

        for (int i = 0; i < countToPush; i++) { //for petlja koja se vrti countToPush puta
            stack.push(Integer.parseInt(numbers[i])); //dodavanje elemenata u stack
        }

        for (int i = 0; i < countToPop; i++) { //uklanjanje onoliko elemenata iz stacka koliko je countToPop
            stack.pop();
        }

        if(stack.contains(element)){ //provera da li element postoji u stacku
            System.out.print("true"); //ako postoji element p=ispisujemo true
        } else if (stack.isEmpty()){ //ako je prazan stack
            System.out.print(0); //ispisujemo 0
        } else { //ako stack nije prazan, ali ne postoji element, trazimo min
            for(Integer num : stack){ //prolazimo kroz stack
                if(num < min){ //poredimo elemente i minimum
                    min = num; //ako je element manji od trenutnog minimuma, on postaje minimum
                }
            }
            System.out.print(min);
        }


    }
}
