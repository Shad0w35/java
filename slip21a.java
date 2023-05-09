import java.util.*;

public class SlipA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList subjectList = new LinkedList();

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter subject name " + i + ": ");
            String subjectName = scanner.nextLine();
            subjectList.add(subjectName);
        }

        System.out.println("\nSubjects stored in the LinkedList:");

        
        Iterator iterator = subjectList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}