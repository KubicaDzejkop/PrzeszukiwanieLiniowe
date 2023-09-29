import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Przeszukiwanie liniowe zbioru liczbowego");
        System.out.println("Podaj wielkość tablicy");
        Scanner scanner = new Scanner(System.in);
        int sizeTab = scanner.nextInt();
        int[] numberTab = new int[sizeTab];
        for (int i = 0; i < sizeTab; i++) {
            if (i % 10 == 0) System.out.println();
            numberTab[i] = (int) (Math.random() * 100);
            System.out.print(numberTab[i] + ", ");
        }
        System.out.println("\nPodaj liczbę, którą chcesz odnaleźć");
        int lockedForNumber = scanner.nextInt();

        boolean isTrue = findNumber(numberTab, lockedForNumber);
        if(isTrue) System.out.println("Szukana liczba jest w zbiorze liczb");
            else System.out.println("\nSzukanej liczby nie ma w zbiorze");
//                + findNumber(numberTab, lockedForNumber));

    }

    public static boolean findNumber(int[] numberTab, int lockedForNumber) {
        int i = 0;
        int n = numberTab.length;
        while(i < n && numberTab[i] != lockedForNumber) i++;
        if (i == n) return false;
        return true;
    }
}