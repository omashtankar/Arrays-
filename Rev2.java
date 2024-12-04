import java.util.*;
public class Rev2{
    public static void maxsubArrsum(int a[]){
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            for(int j=0;j< a.length; j++){
                int sum =0;
                for (int k=i; k<=j; k++){
                    System.out.print(a[k]+" ");
                    sum+=a[k];
                    if(max<sum){
                        max=sum;
                    }
                }
                if(i<=j){
                    System.out.println("  Sum is "+sum);
                }
            }
        }
        System.out.println(" The max sum is "+ max);
    }
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int a[]= {1,2,3,4,5,6,7,8,9};
        maxsubArrsum(a);
        

    }
}