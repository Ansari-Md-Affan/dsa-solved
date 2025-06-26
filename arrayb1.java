public class arrayb1 {
    public static void min(int []a){
        
        int b=a[0];
        for(int i=1;i<a.length;i++){
            
            if (b>a[i]){
                b=a[i];
            }
        }
    System.out.println("The minimum number in array is "+ b);
    }
    public static void max(int a[]){
         int b=a[0];
        for(int i=1;i<a.length;i++){
            
            if (b<a[i]){
                b=a[i];
            }
        }
    System.out.println("The maximum number in array is "+ b);
    }

    public static void main(String[] args) {
        int[] a=new int[]{2,3,4,5,8};
    max(a);
    min(a);
    }
} 
