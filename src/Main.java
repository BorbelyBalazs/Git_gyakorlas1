import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = new int[20];

       for (int i = 0; i < arr.length; i++) {
           arr[i] = (int) (Math.random()*100)+1;
       }

        System.out.println(getMin(arr));
        System.out.println(sumEvens(arr));
    }
    public static int getMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int sumEvens(int[] arr) {
        int counter = 0;

        for (var i: arr) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}