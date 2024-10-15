import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    /*
     * Bro use set check if ele in set if it return true not then add in set
     */
    private static boolean cd(int[] arr){
       Set<Integer> set = new HashSet<Integer>();
       for(int i=0;i<arr.length;i++){
         if(set.contains(arr[i])){
            return true;
         }
         set.add(arr[i]);
       }
       return false;
    }
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Input Size:");
      int size = in.nextInt();
      int[] arr = new int[size];
      for(int i=0;i<size;i++){
        System.out.print("Enter the ele in index"+i+": ");
        arr[i] = in.nextInt();
      }
        System.out.println(cd(arr));

      in.close();
   } 
}
