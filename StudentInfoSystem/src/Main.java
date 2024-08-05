
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Fredrich Gaus","Mth","333");
        Teacher t2 = new Teacher("Nikola Tesla", "Phy","555");
        Teacher t3 = new Teacher("Antoine Lavoisier","Che","999");


        Course maths = new Course("Maths","101","Mth",0.2);
        maths.addTeacher(t1);

        Course physics = new Course("Physics","102","Phy",0.);
        physics.addTeacher(t2);


        Course chemistry = new Course("Chemistry","103","Che",0.2);
        chemistry.addTeacher(t3);


        Student s1 = new Student("Robert Boyle","121", "4",maths,physics,chemistry);
        Student s2 = new Student("Carl Sagan","192","3",maths,physics,chemistry);
        Student s3 = new Student("Leonhard Euler","186","2",maths,physics,chemistry);


       s1.addBulkExamNote(80,85,90);
       s1.addBulkOpinionNote(90,95,1000);
       s1.isPass();

       s2.addBulkExamNote(50,20,40);
       s2.addBulkOpinionNote(50,50,50);
       s2.isPass();

       s3.addBulkExamNote(84,76,61);
       s3.addBulkOpinionNote(84,76,61);
       s3.isPass();





    }

    }
