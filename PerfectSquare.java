import java.util.*;
public class PerfectSquare{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,num,sqrt;
        System.out.print("Enter the size of the array: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        System.out.print("Perfect square numbers in the array: ");
        for(i=0;i<n;i++) {
            num=arr[i];
            if(num<0) {
                continue; 
            }
            sqrt=(int)Math.sqrt(num);
            if(sqrt*sqrt==num) {
                System.out.print(num + " ");
            }
        }
    }
}
