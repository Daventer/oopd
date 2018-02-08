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