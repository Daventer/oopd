import processing.core.PApplet;
import java.util.ArrayList;

public class MainApp extends PApplet{
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    private ArrayList<WeergaveObject> allObjects = new ArrayList();

    public void settings(){
        size(400, 400);
    }

    public void setup(){
        Rechthoek objectA = new Rechthoek(10, 10, 100, 50);
        Rechthoek objectB = new Rechthoek(10, 80, 100, 50);
        IReageerder reageerder =  new HalloReageerder("test");
        objectA.voegReageerderToe(reageerder);
        allObjects.add(objectA);
        allObjects.add(objectB);
    }

    public void draw() {
        for (WeergaveObject object : allObjects) {
            object.geefWeer(this, 10, 10);
        }
    }

    public void mousePressed(){
        for(WeergaveObject object: allObjects){
            object.geefMousePressedGebeurtenis(mouseX, mouseY);
        }
    }
}
