import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mat,phy,tur,che,mus;
        double avarage;
        String s;

        System.out.print("Math grade: ");
        mat = inp.nextInt();
        if(0 < mat && mat < 100) {
        } else {
         mat = 0;
        }

        System.out.print("Physics grade: ");
        phy = inp.nextInt();
        if(0 < phy && phy < 100) {
        } else {
            phy = 0;
        }

        System.out.print("Turkish grade: ");
        tur = inp.nextInt();
        if(0 < tur && tur < 100) {
        } else {
            tur = 0;
        }

        System.out.print("Chemistry grade: ");
        che = inp.nextInt();
        if(0 < che && che < 100) {
        } else {
            che = 0;
        }

        System.out.print("Music grade: ");
        mus = inp.nextInt();
        if(0 < mus && mus < 100) {
        } else {
            mus = 0;
        }

        avarage = (mat + phy + tur + che + mus) / 5;
        System.out.println("Your avarage score: "+ avarage);


        if (avarage>55) {
            System.out.println("Pass the class");
        } else {
            System.out.println("Fail the class");
        }

        }
    }
