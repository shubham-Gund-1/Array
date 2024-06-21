import java.util.Scanner;
public class MargeArray {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        n=sc.nextInt();
        int a[] = new int [n];
        int b[] = new int [n];
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int c[] = new int [c1];
        System.out.println("Enter "+n+" array:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Entered array:");
        for(i=0;i<n;i++){
            System.out.println("Index: "+i+" = "+a[i]);
        }
        System.out.println("Enter second "+n+" array:");
        for(i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        System.out.println("Entered array:");
        for(i=0;i<n;i++){
            System.out.println("Index: "+i+" = "+b[i]);
        }
        for(i=0;i<a1;i++){
            c[i] = a[i];
        }
        for(i=0;i<b1;i++){
            c[a1+i] = b[i];
        }
        for(i=0;i<c1;i++){
            System.out.print(" "+c[i]);
        }
    }
}
