import java.util.Arrays;

/**
 * TwoSum
 * Intution is Bro 3 steps
 * one- sort arr
 * two- two pointer l,r sum == target then return 
 * three- movement algo -> if(sum > target) r--; else l++;
 */
public class TwoSum {
   public static void main(String[] args){
    int target =9;
    int[] arr = new int[]{2,7,11,15};
    Arrays.sort(arr);
    int l=0;
    int r= arr.length-1;
    while(l<r){
        int t = arr[l]+arr[r];
        if(t == target){
            System.out.println(l+" "+r);
            return;
        }else if(t > target){
            r--;
        }else{
            l++;
        }
    }
    System.out.println("No");
    
   }
    
}