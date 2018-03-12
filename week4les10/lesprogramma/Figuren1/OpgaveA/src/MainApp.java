import processing.core.PApplet;

public class MainApp extends PApplet{
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    Cirkel cirkel;
    Rechthoek rechthoek;

    public void settings(){
        size(250, 250);
    }

    public void setup(){
        cirkel = new Cirkel(10, 10, 15);
        rechthoek = new Rechthoek(20, 20, 15, 15);
        cirkel.setSnelheid(1, 1);
        cirkel.setKleur(255);
        rechthoek.setSnelheid(1,1);
        rechthoek.setKleur(100);
//        cirkel.setVersnelling(1, 1);
    }

    public void draw(){
        background(000000);
        cirkel.zetStil();
        if(cirkel.staatStil()){
            cirkel.setSnelheid(1,1);
            cirkel.doeStap();
        }

        cirkel.tekenCirkel(this);

        rechthoek.zetStil();
        if(rechthoek.staatStil()){
            rechthoek.setSnelheid(1,1);
            rechthoek.doeStap();
        }

        rechthoek.tekenRechthoek(this);


    }
}