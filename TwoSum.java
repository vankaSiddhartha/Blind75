import java.util.Scanner;
import java.util.Arrays;

/*
 * intution 3 steps
 * step1: Sort(arr)
 * step2: two pointer l,r
 * step3: (main algo) sum = arr[l]+arr[r] if(sum==target) cool get answer if(sum>target)r--elsel++
 */
public class TwoSum {
    private static int[] indexes(int[]arr,int target){
        int l=0;
        int r=arr.length-1;
        Arrays.sort(arr);
        while (l<r) {
            int sum = arr[l]+arr[r];
            if(sum==target){
                return new int[]{l,r};
            }
            if(sum > target){
                r--;
            }else{
                l++;
            }
        }
        return null;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println("Fill the arrays elements: ");
        for(int i=0;i<size;i++){
            System.out.print("Enter the element "+i+" index");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        int[] result = indexes(arr, target);
            if(result != null){
            System.out.print("["+ result[0]+" "+result[1]+"]");
            }else{
                System.out.println("No");
            }
        sc.close();
    }
}
