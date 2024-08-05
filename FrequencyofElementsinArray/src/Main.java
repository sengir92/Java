import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            if (count >= 1) {
                System.out.println(arr[i] + " number " + count + " repeat many times");
            }
        }

        }
    }


/*
while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
 */