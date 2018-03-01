package Student;

public class MainApp {
    public static void main(String[] args){
        Student s = new Student("han", 602542);
        s.setGeslacht("huh");
        s.setGeslacht("man");
        System.out.println(s.toString());
    }
}
