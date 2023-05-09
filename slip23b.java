 
import java.util.*;  
public class SlipB {
    public static void main(String[] args)
    {
        // Create and populate the list
        ArrayList<String> list
            = new ArrayList<>();
        list.add("vaishnavi");
        list.add("minu");
        list.add("tinu");
        list.add("piu");
        list.add("glu");
        list.add("miku");
        list.add("sanskriti");
        list.add("sanku");
  
        // Displaying the list
        System.out.println("The list is: \n"
                           + list);
  
        // Create an iterator for the list
        // using iterator() method
        Iterator<String> iter
            = list.iterator();
  
        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values"
                           + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}