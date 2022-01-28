
import java.util.Scanner;

public class SolutionA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] inputArray = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            inputArray[i] = scan.nextInt();
        }
        int index = getElementIndex(inputArray, 1, inputArray.length - 1);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("NOT_FOUND");
        }
    }
    public static int getElementIndex(int[] sortedArray, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (sortedArray[1] == 1) {
                return 1;
            } else if (sortedArray[mid] == mid) {
                return mid;
            } else if (sortedArray[mid] == mid && sortedArray[mid - 1] == (mid - 1)) {
                return mid - 1;
            } else if (mid < sortedArray[mid]) {
                return getElementIndex(sortedArray, start, mid-1);
            } else {
                return getElementIndex(sortedArray, mid + 1, end);
            }
        }
        return -1;
    }

}