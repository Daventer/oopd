class Damsteen {
  int x;
  int y;
  int diameter;
  color kleur;

  Damsteen (int x, int y, int diameter, color kleur) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.kleur = kleur;
  }
}

void setup() {
  size(250, 250);
  Damsteen zwart = new Damsteen(10, 10, 20, #000000);
  Damsteen wit = new Damsteen(10, 240, 20, #ffffff);

  Damsteen[] damstenen = {zwart, wit};

  tekenDamstenen(damstenen);
}

void tekenDamstenen(Damsteen[] damstenen) {
  for (int i =0; i<damstenen.length; i++) {
    int x = damstenen[i].x;
    int y = damstenen[i].y;
    int diameter = damstenen[i].diameter;
    color kleur = damstenen[i].kleur;
    tekenDamsteen(x, y, diameter, kleur);
  }
}

void tekenDamsteen(int x, int y, int diameter, color kleur) {
  fill(kleur);
  ellipse(x, y, diameter, diameter);
}