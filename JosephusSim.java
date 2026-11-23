
import java.util.*;
import java.io.*;

public class JosephusSim {
   private PersonNode front;      // a PersonNode pointer that tracks first node in the list
   private int size;              // the number of people in the circle
   private int eliminationCount;  // the number to count to for elimination

   public JosephusSim(String fileName) {
      try {
         // load names from the file in reverse order
         Scanner file = new Scanner(new File(fileName));
         PersonNode last = null;

         while (file.hasNextLine()) {
            String name = file.nextLine().trim();

            if (!name.isEmpty()) {
               PersonNode newNode = new PersonNode(name, front);

               if (size == 0) {
                  last = newNode;
               }

               front = newNode;
               size++;
            }
         }

         file.close();

         if (size < 2) {
            throw new IllegalArgumentException(
               "At least two people are needed.");
         }

         // make the ring circular by attaching last node's next to front
         last.next = front;

         // generate, print, and save the random elimination count
         Random rand = new Random();
         eliminationCount = rand.nextInt(size / 2) + 1;

         System.out.println("=== Elimination count is "
                            + eliminationCount + " ===");

      } catch (FileNotFoundException e) {
         System.out.println("Something went wrong with " + fileName);
      }
   }

   // optional helper method for constructing the circle
   private void add(String val) {
   }

   public void eliminate() {
      // count to the elimination count

      // print who will be eliminated

      // eliminate the person and update "front" of the circle and size

   }

   public boolean isOver() {
      // check if there's only one person left in the circle
      return false;
   }

   public String toString() {
      // if there's only one person left, print them as the last survivor

      // if many, print survivors (watch out for infinite loop since list is circular)

      return "";
   }
}
