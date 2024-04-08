import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student1 = new Student("Sejal Sharma",101);
        student1.setNumberOfCredits(1);
        student1.setGpa(4.0);

        Student student2 = new Student("Saksham Sharma", 102);
        student2.setNumberOfCredits(2);
        student2.setGpa(5.0);

        Student student3 = new Student("Shreya Sharma", 103);
        student3.setNumberOfCredits(3);
        student3.setGpa(6.0);

        Student student4 = new Student("Sandeep Sharma", 124);
        student4.setNumberOfCredits(4);
        student4.setGpa(2.4);

//        System.out.println(student1);

        Teacher teach1 = new Teacher("Kalpana","Batra","Computers",10);
        Teacher teach2 = new Teacher("Dev","Deshmukh","Biotech",5);

        Course c1 = new Course("Biotechnology");
        Course c2 = new Course("Mathematics");
        Course c3 = new Course("Computer Science");

        c1.setInstructor(teach2);
        ArrayList<Student> biotechStudents = new ArrayList<>();
        biotechStudents.add(student1);
        biotechStudents.add(student4);
        c1.setEnrolledStudents(biotechStudents);

        c3.setInstructor(teach1);
        ArrayList<Student> computerStudents = new ArrayList<>();
        computerStudents.add(student1);
        computerStudents.add(student4);
        c3.setEnrolledStudents(computerStudents);

        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c2);
    }
}
