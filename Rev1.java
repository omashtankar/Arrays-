import java.util.*;
public class Rev1{
    //Sub Arrays
    public static void subArrays(int a[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){//acts as start
            for(int j=0;j<a.length;j++){// acts as end 
                int sum=0;
                for(int k=i;k<=j;k++){ // helps to go from start to end
                    System.out.print(a[k]+"   ");
                    sum+=a[k];
                }
                if(sum!=0){
                    System.out.print(" Sum is"+sum);
                }
                if(max<sum){
                    max=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("MAXIMUM ARRAY SUM IS :   "+ max);
        System.out.println();
    }
    // Pairs in array
    public static void pairs(int a[]){
        int tp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void reversearr(int a[]){
        int si=0;
        int ei=a.length-1;
        while(si<=ei){
            int temp=a[si];
            a[si]=a[ei];
            a[ei]=temp;
            si++;
            ei--;
        }
    }
    //Binary Search (imp) Time complexity for binary search is O(log n)
    public static int binarySearch(int a[], int k){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(a[mid]==k){
                return mid;
            }
            if(a[mid]<k){
                start=mid;//searching in right half
            }
            if(a[mid]>k){
                end=mid-1;//searching in left half
            }
        }
        return -1;
    }
    //finding Smallest in a array
    public static int findSmallest(int a[]){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<max){
                max=a[i];
            }
        }
        return max;
    }
    //finding Larget in a array;
    public static int findLargest(int a[]){
        int larggest= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>larggest){
                larggest=a[i];
            }
        }
        return larggest;
    }
    // //linear Search Time complexity for the linear searcjh is O(n)
    // public static int linearSec(int a[],int k){
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]==k){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    // public static void update(int a[]){
    //     for(int i=0;i<a.length;i++){
    //         a[i]+=1;
    //     }
    // }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    //     int arr[]= new int [50];
    //     String fruits[]={"apple", "mango", "banana"};
    //     System.out.println(fruits.length);
    //     // input output in java
    //     // Storing marks of Phy, Chem, Math
    //     // declaring array
    //     int marks[]=new int[3];
    //     //Storing elements in array OR taking input to array
    //     marks[0]=sc.nextInt();
    //     marks[1]=sc.nextInt();
    //     marks[2]=sc.nextInt();
    //     //displaying elements ofd array;
    //     System.out.println("Physics marks are "+marks[0]);
    //     System.out.println("Chemistry marks are "+marks[1]);
    //     System.out.println("Mathematics marks are "+marks[2]);

    //     //.length() function helps you to find the length of the array 
    //     System.out.println("Length of the Array is :"+marks.length);
    //     // passing array to a funtion 
    //     // arrays are passed by call by referance ---> changes done in the fuctions will be reflected in  the amin function as well
    //     update(marks);
    //     //verification for call by referance

    //     //Making a new array for Linear search 
           int a[]={2,4,6,8,10,12,14,16};
    //     System.out.println("Enter key you need to Search :");
    //     int key =sc.nextInt();
    //     int idx=linearSec(a, key);
    //     if(idx==-1){
    //         System.out.println("Key does not exists");
    //     }
    //     else{
    //         System.out.println("Key is at index "+idx);
    //     }
        //calling the unction for finding the min val
        System.out.println(findLargest(a));
        System.out.println();
        System.out.println("key is the "+ binarySearch(a, 12)+" element. ");
        // reversearr(a);
        printarr(a);
        System.out.println();
        pairs(a);
        System.out.println();
        subArrays(a);


    }
}