import java.util.ArrayList;

public class PersonenLijst {

    private ArrayList<Persoon> lijst;

    public PersonenLijst() {
        lijst = new ArrayList<>();
    }

    public ArrayList<Persoon> getSLBStudenten(Docent SLBer) {
        ArrayList<Persoon> studenten = new ArrayList<>();
        for (Persoon persoon : lijst) {
            if (persoon.getSLBer() == SLBer) {
                studenten.add(persoon);
            }
        }
        return studenten;
    }

    public static void main(String[] args) {
        PersonenLijst p = new PersonenLijst();
        Docent piet = new Docent("Piet", "Jansen", "jnsnp");
        Student marie = new Student("Marie", "Pieters", 31415, piet);
        Student dave = new Student("Quentin", "Dave", 12354, piet);
        Student jan = new Student("Jan", "de Vries", 92653, null); // nog geen SLB’er
        p.lijst.add(piet);
        p.lijst.add(marie);
        p.lijst.add(jan);
        p.lijst.add(dave);

        // voeg zelf nog enkele docenten en studenten toe
        ArrayList<Persoon> studentenVanPiet = p.getSLBStudenten(piet);
        System.out.println(studentenVanPiet);
    }
}