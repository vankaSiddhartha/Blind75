import java.util.Scanner;
public class BestTimeToBuySellStocks {
    /*
     * finding min in every itrration and next step find the max of price and arr[i]-min
     * where price varible store the max price in every itrration where as arr is array with elemets
     * 
     */
    private static int findProfit(int[] arr) {
        int price = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            price = Math.max(price, arr[i] - min);
        }
        return price;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the input at index:"+i);
            arr[i] = in.nextInt();
        }
        in.close();

        System.out.println(findProfit(arr));
    }
 
}
