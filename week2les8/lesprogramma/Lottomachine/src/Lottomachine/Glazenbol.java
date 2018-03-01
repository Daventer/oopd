package Lottomachine;

import java.util.ArrayList;
import java.util.Random;


public class Glazenbol {
    private int aantalBallen;
    ArrayList<Lottobal> verzaameldeBallen = new ArrayList<>();

    public Glazenbol(int aantalBallen){
        this.aantalBallen = aantalBallen;
    }

    public void verzamelAlleBallen(){
        for(int i = 0; i < this.aantalBallen; i++){
            verzaameldeBallen.add(new Lottobal(i+1));
        }
    }

    public Lottobal schepBal(){
        Random random = new Random();
        int bal = random.nextInt(verzaameldeBallen.size());
        Lottobal gekozenBal = verzaameldeBallen.get(bal);
        verzaameldeBallen.remove(bal);
        return gekozenBal;
    }
}
