public class Course {
    //define attributes
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int opinionNote;



    //create constructor method

    Course(String name,String code,String prefix,double effectOralNote){

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.opinionNote = 0;

    }

    void addTeacher(Teacher teacher) {
        if(this.prefix.equals(teacher.branch)){
            this.teacher = teacher;

        } else {
            System.out.println("Teacher and branch are not mapped !");
        }

    }

    void printTeacher() {
        this.teacher.print();
    }




    }





