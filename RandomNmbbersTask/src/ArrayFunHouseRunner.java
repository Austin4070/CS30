public class ArrayFunHouseRunner {
    public static void main(String[] args) {
        int[] array1 = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int[] array2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};

      
        System.out.println("Sum of section (2, 5) in array1: " + ArrayFunHouse.sumSection(array1, 2, 5));
        System.out.println("Sum of section (3, 8) in array2: " + ArrayFunHouse.sumSection(array2, 3, 8));

       
        System.out.println("Occurrences of 7 in array1: " + ArrayFunHouse.countOccurrences(array1, 7));
        System.out.println("Occurrences of 7 in array2: " + ArrayFunHouse.countOccurrences(array2, 7));

  
        int[] newArray1 = ArrayFunHouse.removeValue(array1, 7);
        int[] newArray2 = ArrayFunHouse.removeValue(array2, 7);

        System.out.print("Array1 after removing 7: ");
        ArrayFunHouse.printArray(newArray1);

        System.out.print("Array2 after removing 7: ");
        ArrayFunHouse.printArray(newArray2);
    }
}