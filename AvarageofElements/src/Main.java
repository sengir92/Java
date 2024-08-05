
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};

        double harmonicSeries = 1.0;

        for(int i =1; i <numbers.length; i++) {
            harmonicSeries = 1.0 /i;
        }
        System.out.println("Harmonic Avarage: " + harmonicSeries);





    }
}