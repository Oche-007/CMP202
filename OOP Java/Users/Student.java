package OOP;

public class Student extends User {
    String matric_no = "bhu/22/04/05/0078";
    String admission_no = "0123456789";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result now.";
        } else {
            return "You got 7As, 3Bs and 2Cs";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ugbah-Nduka David";
        student.password = "Bingham@123";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
