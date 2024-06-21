import java.util.Scanner;
public class SecoundSmallest {
    public static void main(String[] args) {
        int n,i,j,temp;
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
        for(i=0;i<(n-1);i++){
            for(j=i+1;j<n;j++)
            {
              if(a[i] > a[j])
              {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
              }
            }
        }
            System.out.println("Secound Smallest: "+a[1]);
    }
}
