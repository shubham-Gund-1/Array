import java.util.*;
public class PrimePalidrome{
    public static void main(String args[]) {
        int n,i,temp,flag=0,j,sum,n1;
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
        temp = n;
        for (i = 0; i < n; i++) {
                flag=0;
                int r=a[i];
                for (j = 2; j <= (r/2); j++) {
                    if (r % j == 0) {
                        flag=1;
                        break;
                    }
                }
                sum = 0;
                temp = j;
                while (temp > 0) {
                    n1 = temp % 10;
                    sum = (sum * 10) + n1;
                    temp = temp / 10;
                }
            if (sum==a[i] || flag == 0) {
                System.out.println(r);
            }
        }
    }
}