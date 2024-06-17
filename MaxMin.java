import java.util.*;
public class MaxMin{
    public static void main(String args[]){
        int n,i,min,max;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array :");
        n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" Elements :");
        for(i=0;i<n;i++){
            a[i]=input.nextInt();
        }
       max=min=a[0];
       for(i=1;i<n;i++){
           if(a[i]>max)
           max=a[i];
           if(a[i]<min)
           min=a[i];
       }
       System.out.println("Max number is "+max);
       System.out.println("Min number is "+min);
       
    }
}