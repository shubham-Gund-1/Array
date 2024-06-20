import java.util.*;
public class Swapp {
    public static void main(String args[]) {
        int n, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n = input.nextInt();
        if (n%2==0) {
            System.out.println("Enter " + n + " elements:");
            int arr[] = new int[n];
            for (i=0;i<n;i++) {
                arr[i] = input.nextInt();
            }
            System.out.print("Original array is: ");
            for(i=0;i<n;i++) {
                System.out.print(arr[i] + " ");
            }
            for(i=0;i<n-1; i+=2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            System.out.print("\nSwapped array is: ");
            for(i=0;i<n;i++) {
                System.out.print(arr[i] + " ");
            } 
        } else {
            System.out.println("Swapping is not possible for arrays with odd index.");
        }
    }
}
