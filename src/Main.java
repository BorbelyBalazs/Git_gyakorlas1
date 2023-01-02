import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = new int[20];

       for (int i = 0; i < arr.length; i++) {
           arr[i] = (int) (Math.random()*100)+1;
       }
    }

    public static int max(int[] arr){
      return Arrays.stream(arr).max().getAsInt();
    }
}