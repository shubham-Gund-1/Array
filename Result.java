import java.util.*;
public class Result{
    public static void main(String args[]){
        int n,i,sum=0,per=0,flag=0,cnt=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array :");
        n=input.nextInt();
        System.out.println("Enter "+n+" Elements :");
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Student marks is :");
        for(i=0;i<n;i++){
            System.out.print(" "+arr[i]);
            sum=sum+arr[i];
            per=sum/n;
        }
        // for(i=0;i<3;i++){
        //     if(arr[i]<35){
        //         flag=1;
        //     }
        // }
        // if(flag==1){
        //         System.out.println("ATKT fail..");
        //     }
        //     else {
        //         System.out.println("Pass class");
        // }
        for(i=0;i<n;i++){
            if(arr[i]<35){
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println("Pass");
        }
        else if(cnt<=n/3){
            System.out.println("fail class ");
        }
    }
}