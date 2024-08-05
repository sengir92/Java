import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isFind(int [] arr,int value) {
        for(int i:arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 2, 11, 22, 22, 1, 33, 1, 9, 8, 18, 18, 6};

        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);

            }
        }
    }

    }
