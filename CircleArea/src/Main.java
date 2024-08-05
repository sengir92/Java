import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14,alan,aci;
        System.out.print("Yarıçapı Giriniz: ");
        r = input.nextInt();
        System.out.print("Açı Giriniz: ");
        aci = input.nextInt();
        alan = pi*(r*r)*(aci/360);
        System.out.print("Dairenin alanaı: " + alan);
    }
}