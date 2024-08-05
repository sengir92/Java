import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,vucutKitleIndeksi;
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();
        vucutKitleIndeksi = kilo/(boy*boy);
        System.out.print(vucutKitleIndeksi);
    }
}