import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        int i,n,key=10,flag=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size of array :");
        n=input.nextInt();
        System.out.print("Enter "+n+" Elements:");
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            if(key==arr[i]){
                flag=1;
                System.out.println("Element found "+arr[i]);
            }
        }
        if(flag==0){
            System.out.println("Key is not found");
        }
    }
}