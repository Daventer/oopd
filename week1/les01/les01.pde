int getalA = 5;
int getalB = 2;
float resultaat;

void setup(){
  resultaat = floatDelen(getalA, getalB);
  println(resultaat);
}

float floatDelen(int getalA, int getalB){
  float resultaat = float(getalA) / float(getalB);
  return resultaat;
}