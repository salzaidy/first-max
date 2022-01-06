import java.util.Arrays;
import java.util.Scanner;

class FirstMax {
    public static void main(String[] args) {
        // put your code here
        
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int ele = scanner.nextInt();
        int[] arr = new int[ele];
        
        for (int i=0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int ind = 0;


        for (int i=1; i< arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ind = i;
            } else {
                continue;
            }
        }
        System.out.println(ind);
        
    }
}
