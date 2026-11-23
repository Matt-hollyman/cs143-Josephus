//Yunfeng Duan
//CS 143
//Program #5: Josephus Problem 
//Use a circular linked list to eliminate people until one person remains.
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
      // check if only one person is left
      if (size <= 1) {
         return;
      }

      // find the node before front
      PersonNode previous = front;

      while (previous.next != front) {
         previous = previous.next;
      }

      PersonNode current = front;

      // count to the elimination count
      for (int i = 1; i < eliminationCount; i++) {
         previous = current;
         current = current.next;
      }

      // print who will be eliminated
      System.out.println(current.name + " eliminated!");

      // eliminate the person
      previous.next = current.next;

      // update front and size
      front = current.next;
      size--;
   }


   public boolean isOver() {
      // check if there's only one person left in the circle
      return size == 1;
   }

   
   public String toString() {
      // if there's only one person left, print the last survivor
      if (isOver()) {
         return front.name + " is the last survivor!";
      }

      // print all remaining survivors
      String result = "Remaining survivors: ";
      PersonNode current = front;

      for (int i = 1; i <= size; i++) {
         if (i > 1) {
            result += ", ";
         }

         result += i + "-" + current.name;
         current = current.next;
      }

      return result;
   }

}
