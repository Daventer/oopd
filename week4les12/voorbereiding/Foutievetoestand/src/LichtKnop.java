import processing.core.PApplet;

public class LichtKnop extends Knop {

	private Licht licht;

	
	public LichtKnop(PApplet app, Licht licht, float x, float y, float breedte,
			float hoogte) {
		super(app, x, y, breedte, hoogte);
		this.licht = licht;
		
	}

	@Override
	public void doeKnopActie() {
		licht.schakelLicht();
	}

}
