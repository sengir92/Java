
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Muhammed Ali",25,100,95,15);
        Fighter f2 = new Fighter("George Foreman",15,120,100,25);

     Match match = new Match(f1,f2,85,100);
     match.run();

    }
}