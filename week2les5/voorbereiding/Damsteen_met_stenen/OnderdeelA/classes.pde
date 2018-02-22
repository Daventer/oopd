class Damsteen {
  int x;
  int y;
  int diameter;
  color kleur;
  boolean geselecteerd;

  Damsteen (int x, int y, int diameter, color kleur, boolean geselecteerd) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.kleur = kleur;
    this.geselecteerd = geselecteerd;
  }
  
  void tekenDamsteen() {
    fill(kleur);
    if (geselecteerd) { 
      stroke(#ff0000);
    } else { 
      noStroke();
    }
    ellipse(x, y, diameter, diameter);
  }
}