import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int day;
        String month;

        System.out.print("Which month are you born:");
        month = inp.nextLine();
        System.out.print("Which day are you born: ");
        day = inp.nextInt();


        if (month.equals("January")) {
            if (day >= 1 && day <22) {
                System.out.println("Your zodiac sign is capricorn");
            } else if (day >= 22 && day < 32) {
                System.out.println("Your zodiac sign is aquarius");
            }
        }

        if (month.equals("February")) {
            if (day >= 1 && day <19) {
                System.out.println("Your zodiac sign is aquarius");
            } else if (day >=19  && day < 30) {
                System.out.println("Your zodiac sign is pisces");
            }
        }

        if (month.equals("March")) {
            if (day >= 1 && day <20) {
                System.out.println("Your zodiac sign is pisces");
            } else if (day >= 22 && day < 32) {
                System.out.println("Your zodiac sign is aries");
            }
        }

        if (month.equals("April")) {
            if (day >= 1 && day <20) {
                System.out.println("Your zodiac sign is aries");
            } else if (day >= 21 && day < 30) {
                System.out.println("Your zodiac sign is taurus");
            }
        }

        if (month.equals("May")) {
            if (day >= 1 && day <22) {
                System.out.println("Your zodiac sign is taurus");
            } else if (day >= 22 && day < 32) {
                System.out.println("Your zodiac sign is gemini");
            }
        }

        if (month.equals("June")) {
            if (day >= 1 && day <22) {
                System.out.println("Your zodiac sign is gemini");
            } else if (day >= 22 && day < 31) {
                System.out.println("Your zodiac sign is cancer");
            }
        }

        if (month.equals("July")) {
            if (day >= 1 && day <23) {
                System.out.println("Your zodiac sign is cancer");
            } else if (day >= 23 && day < 32) {
                System.out.println("Your zodiac sign is leo");
            }
        }

        if (month.equals("August")) {
            if (day >= 1 && day <22) {
                System.out.println("Your zodiac sign is leo");
            } else if (day >= 22 && day < 32) {
                System.out.println("Your zodiac sign is virgo");
            }
        }

        if (month.equals("September")) {
            if (day >= 1 && day <24) {
                System.out.println("Your zodiac sign is virgo");
            } else if (day >= 24 && day < 31) {
                System.out.println("Your zodiac sign is libra");
            }
        }

        if (month.equals("October")) {
            if (day >= 1 && day <24) {
                System.out.println("Your zodiac sign is libra");
            } else if (day >= 22 && day < 32) {
                System.out.println("Your zodiac sign is scorpio");
            }
        }

        if (month.equals("November")) {
            if (day >= 1 && day <23) {
                System.out.println("Your zodiac sign is scorpio");
            } else if (day >= 23 && day < 31) {
                System.out.println("Your zodiac sign is sagittarius");
            }
        }

        if (month.equals("December")) {
            if (day >= 1 && day <23) {
                System.out.println("Your zodiac sign is sagittarius");
            } else if (day >= 23 && day < 32) {
                System.out.println("Your zodiac sign is capricorn");
            }
        }
    }

}