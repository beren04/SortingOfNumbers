package first;


import java.util.Arrays;
import java.util.Scanner;

public class sortingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Array:");
        int lgth = input.nextInt();

        int[] arr = new int[lgth];
        for(int i=0;i<lgth;i++) {
            System.out.print("Enter the " + (i + 1) + ".number:");
            int a = input.nextInt();
            arr[i]=a;
        }
        Arrays.sort(arr);
        System.out.print("Sorting of the numbers:"+Arrays.toString(arr));
    }
}
