import java.util.*;
public class Perfect{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i, j, n, sum;
        System.out.println("Enter size of array:");
        n = input.nextInt();
        System.out.println("Enter " + n + " Elements:");
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Perfect numbers in the array:");
        for (i = 0; i < n; i++) {
            sum = 0;
            if (a[i] <= 1) {
                continue;
            }
            for (j = 1; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    sum =sum+j;
                }
            }
            if (sum == a[i]) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
