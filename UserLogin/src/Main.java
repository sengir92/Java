import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,choose,nPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if(userName.equals("patika")&& password.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else {
                if(!userName.equals("patika")) {
                    System.out.println("Bilgileriniz yanlış girdiniz");
                } else {
                if(!password.equals("java123")) {
                System.out.println("Şifreniz Yanlış");
                System.out.println("Şifrenizi sıfırlamak ister misiniz? Evet/Hayır");
                choose = inp.nextLine();
                    if (choose.equals("Evet")) {
                    System.out.print("Yeni şifre giriniz:");
                    nPassword = inp.nextLine();
                        if (nPassword.equals("java123")) {
                        System.out.println("Şifre oluşturuldu");
                    }   else {
                            System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz");
                        }
                    }
                }

            }

        }
                    }
                    }











