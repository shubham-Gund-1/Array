import java.util.*;
public class EvenNumbers{
    public static void main(String args[]){
        int i,n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        n=input.nextInt();
        System.out.println("Enter "+n+" Elements :");
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(i=1;i<n;i+=2){
            sum=sum+arr[i];
        }
        System.out.print("Even index sum is :"+sum);
    }
}