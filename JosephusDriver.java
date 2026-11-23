import java.util.*;

public class JosephusDriver {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      JosephusSim simulation = new JosephusSim("people.txt");
      
      while(!simulation.isOver()) {
         System.out.println(simulation);
         System.out.println("\nContinue elimination? <press enter>");
         console.nextLine(); // make the user hit enter to continue
         simulation.eliminate();
      }
      
      System.out.println(simulation);
   }

}

 /* ----jGRASP exec: java JosephusDriver
 === Elimination count is 6 ===
 Remaining survivors: 1-Yunfeng, 2-Mya, 3-Maharshi, 4-Phoung, 5-Lukas, 6-Angel, 7-Anthony, 8-Unumergen, 9-Mohamed, 10-Sophie, 11-Marshall, 12-Ziru
 
 Continue elimination? <press enter>
 
 Angel eliminated!
 Remaining survivors: 1-Anthony, 2-Unumergen, 3-Mohamed, 4-Sophie, 5-Marshall, 6-Ziru, 7-Yunfeng, 8-Mya, 9-Maharshi, 10-Phoung, 11-Lukas
 
 Continue elimination? <press enter>
 
 Ziru eliminated!
 Remaining survivors: 1-Yunfeng, 2-Mya, 3-Maharshi, 4-Phoung, 5-Lukas, 6-Anthony, 7-Unumergen, 8-Mohamed, 9-Sophie, 10-Marshall
 
 Continue elimination? <press enter>
 
 Anthony eliminated!
 Remaining survivors: 1-Unumergen, 2-Mohamed, 3-Sophie, 4-Marshall, 5-Yunfeng, 6-Mya, 7-Maharshi, 8-Phoung, 9-Lukas
 
 Continue elimination? <press enter>
 
 Mya eliminated!
 Remaining survivors: 1-Maharshi, 2-Phoung, 3-Lukas, 4-Unumergen, 5-Mohamed, 6-Sophie, 7-Marshall, 8-Yunfeng
 
 Continue elimination? <press enter>
 
 Sophie eliminated!
 Remaining survivors: 1-Marshall, 2-Yunfeng, 3-Maharshi, 4-Phoung, 5-Lukas, 6-Unumergen, 7-Mohamed
 
 Continue elimination? <press enter>
 
 Unumergen eliminated!
 Remaining survivors: 1-Mohamed, 2-Marshall, 3-Yunfeng, 4-Maharshi, 5-Phoung, 6-Lukas
 
 Continue elimination? <press enter>
 
 Lukas eliminated!
 Remaining survivors: 1-Mohamed, 2-Marshall, 3-Yunfeng, 4-Maharshi, 5-Phoung
 
 Continue elimination? <press enter>
 
 Mohamed eliminated!
 Remaining survivors: 1-Marshall, 2-Yunfeng, 3-Maharshi, 4-Phoung
 
 Continue elimination? <press enter>
 
 Yunfeng eliminated!
 Remaining survivors: 1-Maharshi, 2-Phoung, 3-Marshall
 
 Continue elimination? <press enter>
 
 Marshall eliminated!
 Remaining survivors: 1-Maharshi, 2-Phoung
 
 Continue elimination? <press enter>
 
 Phoung eliminated!
 Maharshi is the last survivor!
 
  ----jGRASP: Operation complete.
 */