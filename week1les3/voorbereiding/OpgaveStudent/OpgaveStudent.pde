void setup() {
  Student s = new Student("kareltje", 12);
  println(s.naam);
}

class Student {
  String naam;
  int nummer;
  
  Student(String naam, int nummer) {
    naam = naam;
    nummer = nummer;
  }
}