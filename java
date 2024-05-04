public class Class2 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails(){
        age = 23;
        height = 170;
        name = "Oche";
        password = "Oche007";

        if (password.contains("O")){
            System.out.println("password is easy");
        }
    }

    public static void main(String[] args) {
        Class2 printDetails = new Class2();
        printDetails.printUserDetails();
        
    }
}
