Damsteen zwart1 = new Damsteen(15, 15, 20, #000000, true);
Damsteen zwart2 = new Damsteen(40, 15, 20, #000000, false);
Damsteen wit1 = new Damsteen(15, 235, 20, #ffffff, false);
Damsteen wit2 = new Damsteen(40, 235, 20, #ffffff, false);

Damsteen[] damstenen = {zwart1, zwart2, wit1, wit2};

void setup() {
  size(250, 250);
  noStroke();
}

void draw() {
  tekenDamstenen(damstenen);
}