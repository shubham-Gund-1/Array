import java.util.*;
public class SumOfOdd{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the size of array :");
        n=input.nextInt();
        System.out.println("Enter "+n+" Elemnets :");
        int array[]=new int[n];
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        System.out.print("Odd numbers in array :");
        for(i=0;i<n;i++){
            if(array[i]%2!=0){
                System.out.print(" "+array[i]);
                sum=sum+array[i];
            }
        }
        System.out.println("\nSum of odd numbers in array :"+sum);
    }
}