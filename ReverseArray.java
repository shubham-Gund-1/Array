import java.util.*;
public class ReverseArray{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the size of array :");
        n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+"Elements :");
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("reverse array :");
        for(i=n-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
    }
}