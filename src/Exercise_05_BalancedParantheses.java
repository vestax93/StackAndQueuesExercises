import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercise_05_BalancedParantheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parantheses = scanner.nextLine(); //ucitan string sa zagradama
        if (isBalanced(parantheses)) { //proveravamo da li String balansiran tj. da li sve zagrade imaju para
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBalanced(String parantheses) { //provera da li su balansirane zagrade
        Deque<Character> openingParantheses = new ArrayDeque<>();
        for (int i = 0; i < parantheses.length(); i++) {
            char singleParantheses = parantheses.charAt(i);
            if (singleParantheses == ')') {
                if (openingParantheses.isEmpty()) {
                    return false; //  ) i stack je prazan -> ne postoji otvorena -> ne postuje pravila za zagrade
                }
                char open = openingParantheses.pop(); // uzimamo poslednju otvorenu zagradu
                if (open != '(') { //proveravamo da li je ta poslednja zagrada odgovarajuceg tipa
                    return false;
                }
            } else if (singleParantheses == ']') {
                if (openingParantheses.isEmpty()) {
                    return false; //  ) i stack je prazan -> ne postoji otvorena -> ne postuje pravila za zagrade
                }
                char open = openingParantheses.pop();
                if (open != '[') {
                    return false;
                }
            } else if (singleParantheses == '}') {
                if (openingParantheses.isEmpty()) {
                    return false; //  ) i stack je prazan -> ne postoji otvorena -> ne postuje pravila za zagrade
                }
                char open = openingParantheses.pop();
                if (open != '{') {
                    return false;
                }
            } else {
                openingParantheses.push(singleParantheses); //u pitanju je otvorena zagrada, stavljamo na stack
            }
        }
        return true; //prosle su sve provere i nijedna nije vratila false, tako da se onda vraca true
    }

}
