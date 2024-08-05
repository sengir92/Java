import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat, kdvOrani, kdvFiyat, kdvliFiyat;
        System.out.print("fiyat giriniz:");
        fiyat =input.nextInt();
        kdvOrani = fiyat> 1000 ? 0.18: 0.08;
        kdvFiyat = fiyat * kdvOrani;
        kdvliFiyat = fiyat +kdvFiyat;
        System.out.println("KDV'siz fiyat:" + fiyat);
        System.out.println("KDV Oranı:" + kdvOrani);
        System.out.println("KDV fiyatı:" + kdvFiyat);
        System.out.println("KDV'li Fiyat:" +kdvliFiyat);
    }
}