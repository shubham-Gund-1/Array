import java.util.*;
public class Alteranate{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array :");
        n=input.nextInt();
        System.out.println("Enter "+n+" Elements :");
        int array[]=new int[n];
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        System.out.print("Original array is :");
        for(i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.print("\nAlternate Array is :");
        for(i=0;i<n;i+=2){
            System.out.print(" "+array[i]);
        }
    }
}