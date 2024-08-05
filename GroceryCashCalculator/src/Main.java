import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        int armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutTutar,elmaTutar,domatesTutar,muzTutar,patlicanTutar,toplamTutar;
        System.out.print("Kaç kilo armut: " );
        armutKilo = input.nextInt();
        armutTutar = armutKilo * armut;
        System.out.print("Kaç kilo elma: ");
        elmaKilo = input.nextInt();
        elmaTutar = elmaKilo * elma;
        System.out.print("Kaç kilo domates: ");
        domatesKilo = input.nextInt();
        domatesTutar = domatesKilo * domates;
        System.out.print("Kaç kilo muz: ");
        muzKilo = input.nextInt();
        muzTutar = muzKilo * muz;
        System.out.print("Kaç kilo patlıcan: ");
        patlicanKilo = input.nextInt();
        patlicanTutar = patlicanKilo * patlican;
        toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;
        System.out.print("Toplam tutar: " + toplamTutar);
    }
}