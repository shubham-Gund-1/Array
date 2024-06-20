import java.util.*;
public class Palindrom{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n,sum=0,n1,g;
        System.out.println("Enter the size of array :");
        n=input.nextInt();
        System.out.println("Enter "+n+" elemnets :");
        int array[]=new int[n];
        for(i=0;i<n;i++){
            array[i]=input.nextInt();
        }
            System.out.print("Palidrome numbers in array :");
        for(i=0;i<n;i++){
            n1=array[i];
            sum=0;
            while(n1>0){
                g=n1%10;
                n1=n1/10;
                sum=(sum*10)+g;
            }
            if(sum==array[i]){
                System.out.print(" "+array[i]);
            }
        }
    }
}