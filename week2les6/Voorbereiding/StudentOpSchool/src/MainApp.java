import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args) {
        PApplet.main("MainApp", args);
    }

    public void settings() {

    }

    public void setup() {
        School deSchool = new School("ICA");

        Student s1 = new Student("hanneke", 1, deSchool);
        Student s2 = new Student("femke", 2, deSchool);

        println(s1);
        println(s2);
    }

    public void draw() {

    }
}
