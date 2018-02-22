public class MainApp  {
    public static void main(String[] args){
        School deSchool = new School("ICA");

        Student s1 = new Student("hanneke", 1, deSchool);
        Student s2 = new Student("femke", 2, deSchool);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(deSchool);
    }
}
