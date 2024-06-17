import java.util.*;
public class Sum{
    public static void main(String args[]){
        int i,n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array :");
        n=input.nextInt();
        System.out.println("Enter "+n+" Elements");
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
            sum=sum+a[i];
        }
        System.out.print("Array elements is :");
        for(i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("\nSum of array elements is "+sum);
    }
}