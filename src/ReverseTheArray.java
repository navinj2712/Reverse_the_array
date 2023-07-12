import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements : ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int[] outputArray = findReverseTheArray(array);
        for (int i = 0; i < size; i++){
            System.out.print(outputArray[i] + " ");
        }
    }

    private static int[] findReverseTheArray(int[] array) {
        int size = array.length;
        int start = 0, end = size - 1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}
