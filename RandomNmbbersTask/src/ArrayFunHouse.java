import java.util.Arrays;

public class ArrayFunHouse {

    
    public static int sumSection(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

 
    public static int countOccurrences(int[] arr, int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value) {
                count++;
            }
        }
        return count;
    }
    public static int[] removeValue(int[] arr, int value) {
        int count = countOccurrences(arr, value);
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i : arr) {
            if (i != value) {
                newArr[index++] = i;
            }
        }
        return newArr;
    }

   
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}