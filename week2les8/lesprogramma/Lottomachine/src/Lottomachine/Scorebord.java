package Lottomachine;

import java.util.ArrayList;

public class Scorebord {
    ArrayList<Lottobal> geplaatsteBallen = new ArrayList<>();

    public void maakLeeg(){
        geplaatsteBallen.clear();
    }

    public void plaatsBal(Lottobal bal){
        geplaatsteBallen.add(bal);
    }

    public void plaatsBonusBal(Lottobal bal){
        geplaatsteBallen.add(bal);
    }

    public void sorteerBallen() {
        for (int i = geplaatsteBallen.size(); i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (geplaatsteBallen.get(j).balNummer > geplaatsteBallen.get(j + 1).balNummer) {
                    Lottobal bal = geplaatsteBallen.get(j);
                    geplaatsteBallen.set(j, geplaatsteBallen.get(j + 1));
                    geplaatsteBallen.set(j + 1, bal);
                }
            }
        }
    }

    public void printScorebord(){
        System.out.print("De uitslag van een lottotrekking wordt bijvoorbeeld als volgt gepresenteerd: ");
        for(int i = 0; i < 6; i++){
            System.out.print(geplaatsteBallen.get(i).balNummer+" ");
        }
        System.out.println("\nBonusgetal: "+ geplaatsteBallen.get(6).balNummer);

    }
}
