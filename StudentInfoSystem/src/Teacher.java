public class Teacher {
    //define attributes
    String name;
    String  mpno;
    String branch;
    //create constructor method
    Teacher(String name,String branch,String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }

    //define methods

       void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone number: " + this.mpno);
        System.out.println("Branch: " + this.branch);

    }
}
