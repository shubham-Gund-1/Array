import java.util.*;
public class BinarySearch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, i, key, start, end, mid, flag;
        System.out.println("Enter size of array:");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter key to search:");
        key = input.nextInt();
        start = 0;
        end = n - 1;
        flag = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println("Key found at index " + mid);
                flag = 1;
                break;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (flag == 0) {
            System.out.println("Key not found in the array.");
        }
    }
}
