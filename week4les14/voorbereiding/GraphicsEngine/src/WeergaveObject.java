import processing.core.PApplet;

import java.util.ArrayList;

public abstract class WeergaveObject {
    protected float x, y, vx, vy, ax, ay;
    protected float breedte, hoogte;
    protected boolean isZichtbaar;
    protected ArrayList<IReageerder> IReageerder = new ArrayList();

    public WeergaveObject(float x, float y, float breedte, float hoogte) {
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
        isZichtbaar = false;
    }

    public void doeStap() {

    }

    public abstract void geefWeer(PApplet app, float startX, float startY);

    public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
        isZichtbaar = ismuisBinnen(mouseX, mouseY);
        if (isZichtbaar) {
            for(IReageerder reageerder: IReageerder){
                reageerder.doeActie();
            }
        }
    }

    protected abstract boolean ismuisBinnen(int mouseX, int mouseY);

    public void behandelIMousePressedGebeurtenis() {

    }

    public void voegReageerderToe(IReageerder reageerder) {
        IReageerder.add(reageerder);
    }

    public void verwijderReageerder(IReageerder reageerder) {
        IReageerder.remove(reageerder);
    }

}