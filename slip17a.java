import java.util.Scanner;
import java.util.TreeSet;

public class SortedIntegers {
    public static void main(String[] args) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Enter " + N + " integers:");

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            sortedSet.add(num);
        }

        System.out.println("Sorted integers (without duplicates):");
        for (int num : sortedSet) {
            System.out.println(num);
        }
    }
}
