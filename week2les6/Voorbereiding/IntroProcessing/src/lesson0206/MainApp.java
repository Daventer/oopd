package lesson0206;

import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("lesson0206.MainApp", args);
    }

    public void settings() {
        size(250, 250);
    }

    public void setup() {
        School deSchool = new School("ICA");

        Student s1 = new Student("hanneke", 1, deSchool);
        Student s2 = new Student("femke", 2, deSchool);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(deSchool);
    }

    public void draw() {
        background(0);
        ellipse(10, 10, 20, 20);
        rect(40, 40, 40, 40);
    }

}
