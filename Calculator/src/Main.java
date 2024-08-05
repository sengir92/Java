import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a,b,button;

        System.out.print("İlk sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinici sayıyı giriniz: ");
        b= inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem Seçiniz: ");
        button = inp.nextInt();
        switch (button) {
            case 1:
                System.out.print(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.Tekrar tuşlayın");

        }


    }
}