package problems;

public class BinarySearch {
    
    public static boolean binarySearch(int[] array, int target) {
        
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) return true;
            else if (array[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 9));
    }
}
