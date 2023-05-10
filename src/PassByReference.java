import java.util.Arrays;

public class PassByReference {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        modify(number);
        System.out.println(Arrays.toString(number));
    }

    public static void modify(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
