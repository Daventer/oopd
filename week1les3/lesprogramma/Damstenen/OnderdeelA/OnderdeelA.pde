Damsteen zwart1 = new Damsteen(15, 15, 20, #000000);
Damsteen zwart2 = new Damsteen(40, 15, 20, #000000);
Damsteen wit1 = new Damsteen(15, 235, 20, #ffffff);
Damsteen wit2 = new Damsteen(40, 235, 20, #ffffff);

Damsteen[] damstenen = {zwart1, zwart2, wit1, wit2};

void setup() {
  size(250, 250);
  tekenDamstenen(damstenen);
}