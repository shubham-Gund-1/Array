import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        n=sc.nextInt();
        int a[] = new int [n];
        int b[] = new int [n];
        System.out.println("Enter "+n+" array:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("After Remove Duplicate Elements in an array:");
        for(i=0;i<n;i++){
            for(j=i+1; j<n-1;j++)
            {
                if(a[i] == a[j])
                {
                    b[i] = a[i];
                }
            }
            System.out.print(" "+b[i]);
        }
    }
}
