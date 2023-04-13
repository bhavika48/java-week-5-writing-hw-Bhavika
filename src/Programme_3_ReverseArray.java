import java.util.Arrays;

public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 54, 67, 78}; // single dimensional array
        System.out.println("Originaal Array :" + Arrays.toString(array));
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        System.out.println("Reverse Array : ");
        obj.reverseAnArray(array);


    }
    // method to reverse an array

    public void reverseAnArray(int[] list) {
        for (int i = 0; i < (list.length) / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.print(Arrays.toString(list));
    }
}
