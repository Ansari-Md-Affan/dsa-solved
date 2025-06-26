public public class ArrayB2 {
    
    // Recursive method to reverse array
    public static void reverse(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap elements at start and end
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        // Recursive call
        reverse(a, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 4, 5, 6, 9};
        int size = a.length;

        System.out.println("Original array:");
        for (int i : a) {
            System.out.print(i + " ");
        }

        reverse(a, 0, size - 1);

        System.out.println("\nReversed array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

