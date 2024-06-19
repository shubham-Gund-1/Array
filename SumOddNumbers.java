import java.util.*;
public class SumOddNumbers{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,sum=0,n;
        System.out.print("Enter the size of array :");
        n=input.nextInt();
        System.out.println("Enter "+n+" Elements");
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
       for(i=0;i<n;i+=2){
        sum=sum+arr[i];
       }
       System.out.print("sum of odd index element is :"+sum);
    }
}