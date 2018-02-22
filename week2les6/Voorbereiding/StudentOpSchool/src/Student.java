class Student {
    String naam;
    int nummer;
    School school;

    Student(String naam, int nummer, School school) {
        this.naam  = naam;
        this.nummer = nummer;
        this.school = school;
    }

    public String toString() {
        return "De student "+this.naam+" zit op de school "+this.school;
    }
}