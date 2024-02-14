import java.util.Scanner;

public class Exercise_06_ExerciseRecursiveFibonacci {
    public static long[] memory; //ovde cemo pamtiti vec izracunate vrednosti elemenata Fibonacci niza
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        memory = new long[n+1]; //inicijalizujemo niz za pamcenje vec izracunatih vrednosti, treba nam onoliko mesta koliko ima clanova niza

        long result = calculateFibonacci(n); //racunamo vrednost elementa rekurzivno

        System.out.println(result); // prikazujemo element
    }

    private static long calculateFibonacci(int n) {
        if(n < 2){
            return 1; //dosli smo do kraja niza, tj. prva dva elementa tj. to su jedinice
        }
        if(memory[n] != 0){ //ako postoji memorisan vrednost za ovaj element, procitamo iz memorije i ne racunamo
            return memory[n];
        }
        return memory[n] = calculateFibonacci(n-1) + calculateFibonacci(n-2); //formula za izracunavanje clana F. niza (poslednji i pretposlednji clan pre njega)
    }
}
