import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println(getMin(arr));
        System.out.println(getMax(arr));
        System.out.println(countEvens(arr));
        System.out.println(countOdds(arr));
        System.out.println(sumEvens(arr));
        System.out.println(sumOdds(arr));
        System.out.println("conflict");
        System.out.println("conflict2");
    }



    public static int getMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int countEvens(int[] arr) {
        int counter = 0;

        for (var i : arr) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int getMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int sumOdds(int[] arr) {
        return Arrays.stream(arr).filter(a -> a % 2 != 0).sum();
    }

    public static int countOdds(int[] arr){
        return (int) Arrays.stream(arr).filter(a -> a%2 != 0).count();
    }

    private static int sumEvens(int[] arr) {
        int sum = 0;

        for (var i: arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
