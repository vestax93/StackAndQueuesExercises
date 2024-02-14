import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Lab_08_BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> browser = new ArrayDeque<>();
        Deque<String> forward = new ArrayDeque<>();
        String line = scanner.nextLine();
        String curretn = "";

        while(!line.equals("Home")){ //dok naredba nije Home, izvrsava se petlja
            if(line.equals("back")){ //ako je naredba back
                if(!browser.isEmpty()) { //ako imamo prethodne web stranice
                    forward.addFirst(curretn); //pamtimo odakle smo radili back, da mozemo forward po potrebi
                    curretn = browser.pop(); //vracamo se na prethodnu stranicu
                }else{
                    System.out.println("no previous URLs"); //ako ne postoji prethodna stranica
                    line = scanner.nextLine(); //ucitamo novu naredbu
                    continue;
                }
            }else if(line.equals("forward")) { //ako je naredba forward
                if(!forward.isEmpty()){ //ako imamo web stranica u forwardu
                    curretn = forward.pollFirst(); //vracamo stranicu sa koje je pozvan back
                }else{
                    System.out.println("no next URLs"); //ako nema prethodne stranice
                    line = scanner.nextLine();
                    continue;
                }
            }else {
                if(!curretn.equals("")) { //neka konkretna web stranica
                    browser.push(curretn); //dodajemo stranicu u istoriju pregledanja
                }
                curretn = line; //ona je trenutna stranica
                forward.clear(); //forward se resetuje
            }
            System.out.println(curretn); //prikazujemo trenutnu stranicu
            line = scanner.nextLine(); //ucitavamo nnovu naredbu
        }

    }
}
