import Persoon.Persoon;
import processing.core.PApplet;

public class MainApp extends PApplet{
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    public void settings(){
        size(250,250);
    }

    public void setup(){
        Persoon persoon = new Persoon();
        System.out.print(persoon.naam);
    }

    public void draw(){

    }
}
