public class Student {
    //define attributes
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    //crate constructor method
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        if ((note1 >= 0) && (note1 <= 100)) {
            this.c1.note = note1;
        }
        if ((note2 >= 0) && (note2 <= 100)) {
            this.c2.note = note2;
        }
        if ((note3 >= 0) && (note3 <= 100)) {
            this.c3.note = note3;
        }
    }
    public void addBulkOpinionNote(int opinionNote1, int opinionNote2, int opinionNote3) {
        if ((opinionNote1 >= 0) && (opinionNote1 <= 100)) {
            this.c1.opinionNote = opinionNote1;
        }
        if ((opinionNote2 >= 0) && (opinionNote2 <= 100)) {
            this.c2.opinionNote = opinionNote2;
        }
        if ((opinionNote3 >= 0) && (opinionNote3 <= 100)) {
            this.c3.opinionNote = opinionNote3;
        }
    }

    public void isPass() {
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
            System.out.println("Notes not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarge : " + this.avarage);
            if (this.isPass) {
                System.out.println("Pass the class. ");
            } else {
                System.out.println("Fail the class.");
            }
        }
    }


    public void calcAvarage () {
        this.avarage = (((this.c1.note * 0.80) + (this.c1.opinionNote * 0.20)) +
                ((this.c2.note * 0.80) + (this.c2.opinionNote * 0.20))+
                ((this.c3.note * 0.80) + (this.c3.opinionNote * 0.20))) / 3;

        }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }


    public void printNote() {
        System.out.println("-------------");
        System.out.println(this.c1.name + " Note: " + this.c1.note + " Opinion Note: " +this.c1.opinionNote);
        System.out.println(this.c2.name + " Note: " + this.c2.note + " Opinion Note: " +this.c2.opinionNote);
        System.out.println(this.c3.name + " Note: " + this.c3.note + " Opinion Note: " +this.c3.opinionNote);
        System.out.println("Your Avarage: " + this.avarage);
    }







}
