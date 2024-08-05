import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double ucret,kmucreti = 2.20, acilis = 10;
        System.out.print("Km giriniz: ");
        km = input.nextInt();
        ucret = acilis + (km*kmucreti);
        ucret = (ucret>20) ? ucret:20;
        System.out.println("Toplam Ucret: " +ucret);
    }
}