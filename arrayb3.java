import java.util.*;
public class arrayb3 {
    public static void display(int a[]){
        int size=a.length;
        System.out.print("Element of array is:");
        for(int i=0;i<size;i++){
            System.out.print(" "+a[i]);
        }System.out.println();
    }
    public static void min(int[] a,int k){
        int b=a[0];
        for(int i=1;i<k;i++){
            if(b>a[i]){
                b=a[i];
            }
        }
        System.out.println("The minimum element is:"+ b);
    }
    public static void max(int[] a,int k){
        int b=a[0];
        for(int i=1;i<k;i++){
            if(b<a[i]){
                b=a[i];
            }
        }
        System.out.println("The maximum element is:"+ b);
    }
    public static void main(String[] args) {
          int k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element:");
        k=sc.nextInt();
        int[] array=new int[k];
        System.out.println("Enter the element:");
        for(int i=0;i<k;i++){
            int temp=sc.nextInt();
            array[i]=temp;
        }
        display(array);
        min(array,k);
        max(array, k);
    sc.close();
    }

}
