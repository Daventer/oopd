import processing.core.PApplet;

public class Rechthoek extends Figuur{

    float xPos, yPos;

    public Rechthoek(float x, float y, float breedte, float hoogte){
        super(x, y, breedte, hoogte);
    }

    @Override
    public void geefWeer(PApplet app, float startX, float startY){
        xPos = startX+this.x;
        yPos = startY+this.y;
        app.fill(0x000000);
        app.rect(xPos, yPos, this.breedte, this.hoogte);
    }

    @Override
    public boolean ismuisBinnen(int mouseX, int mouseY){
        if(mouseX >= xPos && mouseX < xPos + breedte &&
                mouseY >= yPos && mouseY <yPos +hoogte){
            return true;
        }else {
            return false;
        }
    }
}
