
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise_03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inic skenera
        int n = Integer.parseInt(scanner.nextLine()); //ucitavanje broja komandi

        ArrayDeque<Integer> stack = new ArrayDeque<>(); // inicijalizacija stacka
        TreeSet<Integer> container = new TreeSet<>(); //struktura koja pamti uredjeno brojeve, poslednji je max

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine(); //ucitavanje komande
            byte cmd; //komanda 1 ili 2 ili 3
            int val; //vrednost ako je komanda 1 tj. pushovanje/dodavanje na stack
            if(line.length() > 1){
                val = Integer.parseInt(line.substring(2)); //uzimanje broj iz komande 1 (npr. 1 56)
                stack.push(val); //dodavanje na stack
                container.add(val); //dodavanje u TreeSet koji prati tj. sortira tako da zna maksimum u svakom trenutku
            } else {
                cmd = Byte.parseByte(line); //uzimanje komande (2 ili 3)
                if(cmd == 2){
                    container.remove(stack.pop()); // izbacuje se element iz stacka i iz evidencije za max tj. TreeSet-a
                } else if (cmd == 3){
                    System.out.println(container.last()); // stampanje maksimuma
                }
            }
        }

    }
}

