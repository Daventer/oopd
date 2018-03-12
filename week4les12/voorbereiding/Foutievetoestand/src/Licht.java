import processing.core.PApplet;

public class Licht {
	private PApplet app;
	private int kleur;
	private boolean isAan = false;

	public Licht(PApplet app) {
		this.app = app;
		kleur = 0;
	}
	
	void schakelLicht() {
		if (kleur == 0) {
			kleur = 0xFFA4C739;
			isAan = true;
		}
		else {
			kleur = 0;
			isAan = false;
		}
	}
	
	public void tekenLicht() {
		app.background(kleur);
	}

	public boolean getAan(){
		if (isAan){
			return true;
		}else {
			return false;
		}
	}
}