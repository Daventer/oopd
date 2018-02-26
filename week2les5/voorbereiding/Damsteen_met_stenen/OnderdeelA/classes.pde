class Dambord {
  Damsteen zwart1 = new Damsteen(15, 15, 20, #000000, true);
  Damsteen zwart2 = new Damsteen(40, 15, 20, #000000, false);
  Damsteen wit1 = new Damsteen(15, 235, 20, #ffffff, false);
  Damsteen wit2 = new Damsteen(40, 235, 20, #ffffff, false);

  Damsteen[] damstenen = {zwart1, zwart2, wit1, wit2};

  void tekenDamstenen() {
    for (int i =0; i<damstenen.length; i++) {
      damstenen[i].tekenDamsteen();
    }
  }
}

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