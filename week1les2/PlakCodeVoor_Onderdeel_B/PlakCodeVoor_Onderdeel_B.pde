String[] idLijst = {"8b3", "4bf", "9h0"};

void setup() {
  println(plakCodeVoorIdLijst(idLijst, "NL"));
}

String[] plakCodeVoorIdLijst(String[] lijst, String code){
  String[] nieuwLijst = new String[lijst.length];
  for(int i =0; i<lijst.length; i++){
    nieuwLijst[i] = code + lijst[i];
  }
  return nieuwLijst;
}