package Student;

public class Student {
    private String naam;
    private String geslacht;
    private int studentenNummer;

    public static final String MAN = "man";
    public static final String VROUW = "vrouw";

    private static int nStudenten = 0;

    public Student(String naam, int studentenNummer) {
        this.naam = naam;
        this.studentenNummer = studentenNummer;
        nStudenten++;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        if(geslacht.equals(Student.MAN)  || geslacht.equals(Student.VROUW)){
            this.geslacht = geslacht;
        }
    }

    public static int getNStudenten() {
        return nStudenten;
    }

    public String toString() {
        return getNaam()+" "+getGeslacht()+" "+getStudentenNummer();
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentenNummer(){
        return this.studentenNummer;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
