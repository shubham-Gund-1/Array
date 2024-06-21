import java.util.Scanner;
public class RightRotate {
     public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        n=sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter "+n+" array:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Entered array:");
        for(i=0;i<n;i++){
            System.out.println("Index: "+i+" = "+a[i]);
        }
        System.out.println("After Left Rotate:");
        System.out.println(a[n-2]);
        System.out.println(a[n-1]);
        for(i=0;i<=(n-3);i++){
            System.out.println(a[i]);
        }
    }
}
