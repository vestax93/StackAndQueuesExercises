import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise_04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>(); //inicijalizacija queue-a
        String[] tokens = scanner.nextLine().split(" "); //ucitavanje brojeva za komande (prvi red)

        int countToPush = Integer.parseInt(tokens[0]); //broj koliko treba da dodamo elemenata
        int countToPop = Integer.parseInt(tokens[1]); //broj koliko treba da sklonimo elemenata
        int element = Integer.parseInt(tokens[2]); //broj koji trazimo na kraju u queue-u

        String[] elements = scanner.nextLine().split(" "); //elementi koje cemo ubaciti u queue
        for (int i = 0; i < countToPush; i++) {
            queue.add(Integer.parseInt(elements[i])); //dodavanje elementa u queue i pretvaranje iz stringa u int
        }
        for (int i = 0; i < countToPop; i++) { //petalja ide onoliko puta koliko je definisano za izbacivanje iz queue-a
            queue.remove(); //izbacivanje iz queue-a
        }
        if(queue.contains(element)){ //provera da li je element u queue-u
            System.out.println("true");
        } else if (queue.isEmpty()){ //provera da li je queue prazana, ako jeste prikazujemo 0
            System.out.println(0);
        } else {
            int min = Integer.MAX_VALUE; //inicijalizacija min
            for (Integer num : queue){ //prolazak kroz queue u potrazi za min
                if(min > num){ //ako je neki broj manji od min
                    min = num; //onda on postaje i sam minimum
                }
            }
            System.out.println(min); //prikaz minimuma
        }


    }
}
